package com.example.UnionCoop.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */
public class Transaction {
    @SerializedName("SharePrice")
    @Expose
    private Double sharePrice;
    @SerializedName("TransactionID")
    @Expose
    private String transactionID;
    @SerializedName("Shares")
    @Expose
    private Integer shares;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("ServiceCharges")
    @Expose
    private Integer serviceCharges;

    public Double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getServiceCharges() {
        return serviceCharges;
    }

    public void setServiceCharges(Integer serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

}
