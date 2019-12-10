package com.ez08.retrofitdemo.util;

import com.ez08.retrofitdemo.bean.Translation;

import retrofit2.Call;

import retrofit2.http.GET;


public interface GetRequest_Interface {
    @GET("ajax.php?a=fy&f=auto&t=auto&w=hello%20world")
    Call<Translation> getCall();
}
