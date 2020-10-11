package com.example.UnionCoop.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */
public class Data {
    @SerializedName("Orders")
    @Expose
    private List<Order> orders = null;
    @SerializedName("SHBalanceDetail")
    @Expose
    private SHBalanceDetail sHBalanceDetail;


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public SHBalanceDetail getSHBalanceDetail() {
        return sHBalanceDetail;
    }

    public void setSHBalanceDetail(SHBalanceDetail sHBalanceDetail) {
        this.sHBalanceDetail = sHBalanceDetail;
    }


}
