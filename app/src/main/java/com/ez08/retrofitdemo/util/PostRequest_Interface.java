package com.ez08.retrofitdemo.util;

import com.ez08.retrofitdemo.bean.Translation1;

import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface PostRequest_Interface {

    @POST("translate?doctype=json&jsonversion=&type=&keyfrom=&model=&mid=&imei=&vendor=&screen=&ssid=&network=&abtest=")
    Callback<Translation1> getCall(@Field("i") String targetSentence);
}
