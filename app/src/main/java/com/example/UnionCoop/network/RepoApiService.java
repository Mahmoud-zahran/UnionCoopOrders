package com.example.UnionCoop.network;

import com.example.UnionCoop.model.MyOrder_Main;
import com.example.UnionCoop.model.RepositoryResponse;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */
public interface RepoApiService {

    @GET("main/my_order")
    Observable <MyOrder_Main> getReposData(@Header("Username") String userName
    , @Header("Password") String password, @Header("Content-Type") String content_type
            , @Header("Lang") String lang, @Header("DeviceType") String deviceType
            , @Header("UserID") String userID );
}
