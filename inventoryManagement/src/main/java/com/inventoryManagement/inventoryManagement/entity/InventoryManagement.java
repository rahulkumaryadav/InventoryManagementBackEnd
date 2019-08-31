package com.inventoryManagement.inventoryManagement.entity;

import java.util.Date;

public class InventoryManagement {

    private Long purchesRate;
    private Long saleRate;
    private String productDescription;
    private Date dateCreated;
    private Date dateCreatedBy;

    public InventoryManagement() {
    }

    public InventoryManagement(Long purchesRate, Long saleRate, String productDescription, Date dateCreated, Date dateCreatedBy) {
        this.purchesRate = purchesRate;
        this.saleRate = saleRate;
        this.productDescription = productDescription;
        this.dateCreated = dateCreated;
        this.dateCreatedBy = dateCreatedBy;
    }

    public Long getPurchesRate() {
        return purchesRate;
    }

    public void setPurchesRate(Long purchesRate) {
        this.purchesRate = purchesRate;
    }

    public Long getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(Long saleRate) {
        this.saleRate = saleRate;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreatedBy() {
        return dateCreatedBy;
    }

    public void setDateCreatedBy(Date dateCreatedBy) {
        this.dateCreatedBy = dateCreatedBy;
    }

    @Override
    public String toString() {
        return "InventoryManagement{" +
                "purchesRate=" + purchesRate +
                ", saleRate=" + saleRate +
                ", productDescription='" + productDescription + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateCreatedBy=" + dateCreatedBy +
                '}';
    }
}
