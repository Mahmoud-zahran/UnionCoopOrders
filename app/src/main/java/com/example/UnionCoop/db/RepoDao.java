package com.example.UnionCoop.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import com.example.UnionCoop.model.MyOrder_Main;
import com.example.UnionCoop.model.Order;


import java.util.List;

/**
 * Created by Mahmoud Zahran on 2,Oct,2020
 */

@Dao
public interface RepoDao {

    @Insert
    void insertRepoDao(Order myOrder_main);

    @Query("DELETE FROM favorite_table WHERE orderID = :orderId")
    void deleteRepoDao(String orderId);

    @Query("DELETE FROM favorite_table")
    void deleteAll();

    @Query("SELECT * FROM favorite_table")
    LiveData<Order> getFavoriteRepos();
}
