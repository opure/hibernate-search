
package com.hiberntate.search;

import com.hibernate.search.TopProduct;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Resource
    private EntityManager entityManager;
    @Resource
    private EntityManagerFactory entityManagerFactory;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSearch() throws InterruptedException {

        EntityManager em = entityManagerFactory.createEntityManager();
        FullTextEntityManager fullTextEntityManager =
                org.hibernate.search.jpa.Search.getFullTextEntityManager(em);
        em.getTransaction().

                begin();
        fullTextEntityManager.createIndexer().startAndWait();

        // create native Lucene query unsing the query DSL
// alternatively you can write the Lucene query using the Lucene query parser
// or the Lucene programmatic API. The Hibernate Search DSL is recommended though
        QueryBuilder qb = fullTextEntityManager.getSearchFactory()
                .buildQueryBuilder().forEntity(TopProduct.class).get();
        org.apache.lucene.search.Query luceneQuery = qb
                .keyword()
                .onFields("title", "description", "keyWords")
                .matching("ddddddddd")
                .createQuery();

        // wrap Lucene query in a javax.persistence.Query
        javax.persistence.Query jpaQuery =
                fullTextEntityManager.createFullTextQuery(luceneQuery, TopProduct.class);

        // execute search
        List result = jpaQuery.getResultList();

        em.getTransaction().

                commit();
        em.close();

    }

}

