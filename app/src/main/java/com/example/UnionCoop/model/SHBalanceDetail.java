package com.example.UnionCoop.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */
public class SHBalanceDetail {

    @SerializedName("ENote")
    @Expose
    private Object eNote;
    @SerializedName("TotalBalance")
    @Expose
    private Integer totalBalance;
    @SerializedName("ISTACAgreed")
    @Expose
    private Boolean iSTACAgreed;
    @SerializedName("ISAllowToCreateSellOrder")
    @Expose
    private Boolean iSAllowToCreateSellOrder;
    @SerializedName("AvailableBalanceAmount")
    @Expose
    private Integer availableBalanceAmount;
    @SerializedName("TotalShares")
    @Expose
    private Integer totalShares;
    @SerializedName("AvailableShares")
    @Expose
    private Integer availableShares;
    @SerializedName("ISSHTradingActive")
    @Expose
    private Boolean iSSHTradingActive;
    @SerializedName("OnHoldAmount")
    @Expose
    private Integer onHoldAmount;
    @SerializedName("ISEligibleForTrading")
    @Expose
    private Boolean iSEligibleForTrading;
    @SerializedName("UnderTradingShares")
    @Expose
    private Integer underTradingShares;
    @SerializedName("ISInsider")
    @Expose
    private Boolean iSInsider;
    @SerializedName("ISAllowToCreateBuyOrder")
    @Expose
    private Boolean iSAllowToCreateBuyOrder;
    @SerializedName("ANote")
    @Expose
    private Object aNote;
    @SerializedName("ISTouchIDEnable")
    @Expose
    private Boolean iSTouchIDEnable;
    @SerializedName("MaxSharesBuy")
    @Expose
    private Integer maxSharesBuy;
    @SerializedName("MaxSharesSell")
    @Expose
    private Integer maxSharesSell;
    @SerializedName("ExecutedShares")
    @Expose
    private Integer executedShares;

    public Object getENote() {
        return eNote;
    }

    public void setENote(Object eNote) {
        this.eNote = eNote;
    }

    public Integer getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Integer totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Boolean getISTACAgreed() {
        return iSTACAgreed;
    }

    public void setISTACAgreed(Boolean iSTACAgreed) {
        this.iSTACAgreed = iSTACAgreed;
    }

    public Boolean getISAllowToCreateSellOrder() {
        return iSAllowToCreateSellOrder;
    }

    public void setISAllowToCreateSellOrder(Boolean iSAllowToCreateSellOrder) {
        this.iSAllowToCreateSellOrder = iSAllowToCreateSellOrder;
    }

    public Integer getAvailableBalanceAmount() {
        return availableBalanceAmount;
    }

    public void setAvailableBalanceAmount(Integer availableBalanceAmount) {
        this.availableBalanceAmount = availableBalanceAmount;
    }

    public Integer getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(Integer totalShares) {
        this.totalShares = totalShares;
    }

    public Integer getAvailableShares() {
        return availableShares;
    }

    public void setAvailableShares(Integer availableShares) {
        this.availableShares = availableShares;
    }

    public Boolean getISSHTradingActive() {
        return iSSHTradingActive;
    }

    public void setISSHTradingActive(Boolean iSSHTradingActive) {
        this.iSSHTradingActive = iSSHTradingActive;
    }

    public Integer getOnHoldAmount() {
        return onHoldAmount;
    }

    public void setOnHoldAmount(Integer onHoldAmount) {
        this.onHoldAmount = onHoldAmount;
    }

    public Boolean getISEligibleForTrading() {
        return iSEligibleForTrading;
    }

    public void setISEligibleForTrading(Boolean iSEligibleForTrading) {
        this.iSEligibleForTrading = iSEligibleForTrading;
    }

    public Integer getUnderTradingShares() {
        return underTradingShares;
    }

    public void setUnderTradingShares(Integer underTradingShares) {
        this.underTradingShares = underTradingShares;
    }

    public Boolean getISInsider() {
        return iSInsider;
    }

    public void setISInsider(Boolean iSInsider) {
        this.iSInsider = iSInsider;
    }

    public Boolean getISAllowToCreateBuyOrder() {
        return iSAllowToCreateBuyOrder;
    }

    public void setISAllowToCreateBuyOrder(Boolean iSAllowToCreateBuyOrder) {
        this.iSAllowToCreateBuyOrder = iSAllowToCreateBuyOrder;
    }

    public Object getANote() {
        return aNote;
    }

    public void setANote(Object aNote) {
        this.aNote = aNote;
    }

    public Boolean getISTouchIDEnable() {
        return iSTouchIDEnable;
    }

    public void setISTouchIDEnable(Boolean iSTouchIDEnable) {
        this.iSTouchIDEnable = iSTouchIDEnable;
    }

    public Integer getMaxSharesBuy() {
        return maxSharesBuy;
    }

    public void setMaxSharesBuy(Integer maxSharesBuy) {
        this.maxSharesBuy = maxSharesBuy;
    }

    public Integer getMaxSharesSell() {
        return maxSharesSell;
    }

    public void setMaxSharesSell(Integer maxSharesSell) {
        this.maxSharesSell = maxSharesSell;
    }

    public Integer getExecutedShares() {
        return executedShares;
    }

    public void setExecutedShares(Integer executedShares) {
        this.executedShares = executedShares;
    }

}
