package com.example.UnionCoop.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */
//@Entity(tableName = "favorite_table")
public class MyOrder_Main {



        @SerializedName("Msg")
        @Expose
        private String msg;
        @SerializedName("Result")
        @Expose
        private Integer result;
        @Ignore
        @SerializedName("Data")
        @Expose
        private Data data;

        public String getMsg() {
            return msg;
        }



    public void setMsg(String msg) {
            this.msg = msg;
        }

        public Integer getResult() {
            return result;
        }

        public void setResult(Integer result) {
            this.result = result;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }


}
