package com.example.UnionCoop.repository;

import androidx.lifecycle.LiveData;

import com.example.UnionCoop.db.RepoDao;

import com.example.UnionCoop.model.MyOrder_Main;
import com.example.UnionCoop.model.Order;
import com.example.UnionCoop.model.RepositoryResponse;
import com.example.UnionCoop.network.RepoApiService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Header;

/**
 * Created by Mahmoud Zahran on 2,Oct,2020
 */

public class Repository {

    private RepoDao repoDao;
    private RepoApiService apiService;

    @Inject
    public Repository(RepoDao repoDao, RepoApiService apiService) {
        this.repoDao = repoDao;
        this.apiService = apiService;
    }


    public Observable<MyOrder_Main> getReposData(String userName
            , String password, String content_type
            , String lang, String deviceType
            , String userID){
        return apiService.getReposData(userName
                ,password,content_type
                ,lang,deviceType
                ,userID);
    }

    public void insertRepo(Order myOrder_main){
        repoDao.insertRepoDao(myOrder_main);
    }

    public void deleteRepo(String repo)
    {
        repoDao.deleteRepoDao(repo);
    }

    public void deleteAll(){
        repoDao.deleteAll();
    }

    public LiveData<Order> getFavoriteRepo(){
        return repoDao.getFavoriteRepos();
    }
}
