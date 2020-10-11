package com.example.UnionCoop.viewmodel;

import android.util.Log;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.UnionCoop.model.MyOrder_Main;
//import com.example.UnionCoop.model.RepositoryResponse;
import com.example.UnionCoop.model.Order;
import com.example.UnionCoop.repository.Repository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * Created by Mahmoud Zahran on 11,Oct,2020
 */

public class RepoDataViewModel extends ViewModel {
    private static final String TAG = "RepoDataViewModel";

    private Repository repository;
    private MutableLiveData<MyOrder_Main> mRepoList = new MutableLiveData<MyOrder_Main>();
    private LiveData<Order> favoriteRepoList = null;

    @ViewModelInject
    public RepoDataViewModel(Repository repository) {
        this.repository = repository;
        favoriteRepoList = repository.getFavoriteRepo();
    }

    public MutableLiveData<MyOrder_Main> getmRepoList() {
        return mRepoList;
    }

    public void getRepos(){
        repository.getReposData("##@@$$51216evmajdor1121@#!$*& @ucs.ae",
                "51Kjxaeudnnadb060520190ADMIN3360520190345@ucs.ae",
                "application/json"
                ,"en","IOS/Android",
                "9fSbXMqf7wQ5UmYHcPsDLS4UOXoW7NY4lsQvmWjNO5bOeAbHdqXm53IGoENrygfosLHnqL67E+PC 2YOi4QHATyPuWCxipGT+")
                .subscribeOn(Schedulers.io())
//                .map(new Function<MyOrder_Main>, ArrayList<MyOrder_Main>(){
//                    @Override
//                    public MyOrder_Main apply(MyOrder_Main myOrders) throws Throwable {
//
//                 MyOrder_Main list = (MyOrder_Main) myOrders;
//                        return list;
//                    }
//                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(result -> mRepoList.setValue(result),
                        error-> Log.e(TAG, "getRepos: " + error.getMessage() ));
    }

    public void insertRepo(Order myOrder_main){
        repository.insertRepo(myOrder_main);
    }
    public void deleteRepo(String repoName){
        repository.deleteRepo(repoName);
    }

    public LiveData<Order> getFavoriteRepoList() {
        return favoriteRepoList;
    }

    public void getFavoriteRepo(){
       favoriteRepoList = repository.getFavoriteRepo();
    }



}
