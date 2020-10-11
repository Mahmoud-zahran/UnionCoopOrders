package com.example.UnionCoop.di;

import com.example.UnionCoop.network.RepoApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */

@Module
@InstallIn(ApplicationComponent.class)
public class NetworkModule {

    @Provides
    @Singleton
    public static RepoApiService provideRepoApiService(){

        return  new Retrofit.Builder()
                .baseUrl(" https://raw.githubusercontent.com/mofarhan/my_order_repo/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
                .create(RepoApiService.class);
    }
}
