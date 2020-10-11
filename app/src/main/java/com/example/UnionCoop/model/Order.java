package com.example.UnionCoop.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */

@Entity(tableName = "favorite_table")
public class Order {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("SharePrice")
    @Expose
    private Double sharePrice;
    @SerializedName("HasReciept")
    @Expose
    private Boolean hasReciept;
    @SerializedName("OrderNo")
    @Expose
    private String orderNo;
    @SerializedName("Shares")
    @Expose
    private Integer shares;
    @SerializedName("OrderType")
    @Expose
    private String orderType;
    @SerializedName("RecieptUrl")
    @Expose
    private String recieptUrl;
    @SerializedName("EndDate")
    @Expose
    private String endDate;
    @SerializedName("ProcessingBy")
    @Expose
    private String processingBy;
    @Ignore
    @SerializedName("ISFullTransfer")
    @Expose
    private String iSFullTransfer;
    @SerializedName("DeviceName")
    @Expose
    private String deviceName;
    @SerializedName("RemainingShares")
    @Expose
    private Integer remainingShares;
    @SerializedName("Remarks")
    @Expose
    private String remarks;
    @SerializedName("StatusID")
    @Expose
    private Integer statusID;
    @SerializedName("Transactions")
    @Expose
    @Ignore
    private List<Transaction> transactions = null;
    @SerializedName("AllowToCancel")
    @Expose
    private Boolean allowToCancel;
    @SerializedName("InitialServiceCharges")
    @Expose
    private Integer initialServiceCharges;
    @SerializedName("AllowToEdit")
    @Expose
    private Boolean allowToEdit;
    @SerializedName("OrderID")
    @Expose
    private Integer orderID;
    @SerializedName("ServiceCharges")
    @Expose
    private Integer serviceCharges;
    @SerializedName("SHAddressNo")
    @Expose
    private String sHAddressNo;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Amount")
    @Expose
    private Integer amount;
    @SerializedName("SHNO")
    @Expose
    private String sHNO;
    @Ignore
    @SerializedName("AStatus")
    @Expose
    private String aStatus;

    private boolean expanded=false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public Boolean getHasReciept() {
        return hasReciept;
    }

    public void setHasReciept(Boolean hasReciept) {
        this.hasReciept = hasReciept;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }







    public Integer getRemainingShares() {
        return remainingShares;
    }

    public void setRemainingShares(Integer remainingShares) {
        this.remainingShares = remainingShares;
    }



    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Boolean getAllowToCancel() {
        return allowToCancel;
    }

    public void setAllowToCancel(Boolean allowToCancel) {
        this.allowToCancel = allowToCancel;
    }

    public Integer getInitialServiceCharges() {
        return initialServiceCharges;
    }

    public void setInitialServiceCharges(Integer initialServiceCharges) {
        this.initialServiceCharges = initialServiceCharges;
    }

    public Boolean getAllowToEdit() {
        return allowToEdit;
    }

    public void setAllowToEdit(Boolean allowToEdit) {
        this.allowToEdit = allowToEdit;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getServiceCharges() {
        return serviceCharges;
    }

    public void setServiceCharges(Integer serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public String getSHAddressNo() {
        return sHAddressNo;
    }

    public void setSHAddressNo(String sHAddressNo) {
        this.sHAddressNo = sHAddressNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSHNO() {
        return sHNO;
    }

    public void setSHNO(String sHNO) {
        this.sHNO = sHNO;
    }



    public String getRecieptUrl() {
        return recieptUrl;
    }

    public void setRecieptUrl(String recieptUrl) {
        this.recieptUrl = recieptUrl;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getProcessingBy() {
        return processingBy;
    }

    public void setProcessingBy(String processingBy) {
        this.processingBy = processingBy;
    }



    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getsHAddressNo() {
        return sHAddressNo;
    }

    public void setsHAddressNo(String sHAddressNo) {
        this.sHAddressNo = sHAddressNo;
    }

    public String getsHNO() {
        return sHNO;
    }

    public void setsHNO(String sHNO) {
        this.sHNO = sHNO;
    }

    public String getaStatus() {
        return aStatus;
    }

    public void setaStatus(String aStatus) {
        this.aStatus = aStatus;
    }

    public String getiSFullTransfer() {
        return iSFullTransfer;
    }

    public void setiSFullTransfer(String iSFullTransfer) {
        this.iSFullTransfer = iSFullTransfer;
    }
}
