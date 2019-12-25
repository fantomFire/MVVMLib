package com.zaowu.mvvmlib.apiserver;

import com.zaowu.mvvmlib.login.LoginBean;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.GET;

/**
 * Description:
 * Author     : long
 * Date       : 2019/12/25 15:29
 */
public interface ApiServer {
    @GET("user/1")
    Observable<LoginBean> getRecommendPoetry();
}
