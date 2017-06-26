package com.hibernate.search;

import org.hibernate.search.annotations.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Created by opure on 2017/6/22.
 * TopProduct
 */
@Entity
@Indexed
public class TopProduct {

    @Id
    @GeneratedValue
    @DocumentId
    private Long id;

    private Float actualDaySpan;

    private Float averageSales;

    private Float averageSold;

    private Date createDate;

    private Date dateFrom;

    private Date dateTo;

    private Float price;

    private Float totalSold;

    private Date updateDate;

    private Long productId;

    private String productCode;

    private String productStatus;

    private String listStatus;

    private Date generationTime;

    @Field(index= Index.YES, analyze= Analyze.YES, store= Store.NO)
    private String title;

    @Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
    private String description;

    @Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
    private String keyWords;

    private Date dataUpdateTime;

    @Transient
    private String url;

    @Transient
    private String picture;

    public String getUrl() {
        return "https://www.wish.com/c/" + this.getProductCode();
    }

    public String getPicture() {
        return "https://contestimg.wish.com/api/webimage/" + this.getProductCode() + "-0-feed";
    }

    public float getAverageSales() {
        return averageSales;
    }

    public float getAverageSold() {
        return averageSold;
    }

    public float getPrice() {
        return price;
    }

    public float getTotalSold() {
        return totalSold;
    }


    public float getActualDaySpan() {
        return actualDaySpan;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setAverageSales(float averageSales) {
        this.averageSales = averageSales;
    }

    public void setAverageSold(float averageSold) {
        this.averageSold = averageSold;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTotalSold(float totalSold) {
        this.totalSold = totalSold;
    }

    public void setActualDaySpan(float actualDaySpan) {
        this.actualDaySpan = actualDaySpan;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setActualDaySpan(Float actualDaySpan) {
        this.actualDaySpan = actualDaySpan;
    }

    public void setAverageSales(Float averageSales) {
        this.averageSales = averageSales;
    }

    public void setAverageSold(Float averageSold) {
        this.averageSold = averageSold;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setTotalSold(Float totalSold) {
        this.totalSold = totalSold;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus;
    }

    public Date getGenerationTime() {
        return generationTime;
    }

    public void setGenerationTime(Date generationTime) {
        this.generationTime = generationTime;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Date getDataUpdateTime() {
        return dataUpdateTime;
    }

    public void setDataUpdateTime(Date dataUpdateTime) {
        this.dataUpdateTime = dataUpdateTime;
    }
}


