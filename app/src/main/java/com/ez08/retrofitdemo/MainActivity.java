package com.ez08.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ez08.retrofitdemo.bean.Translation;
import com.ez08.retrofitdemo.util.GetRequest_Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        request();
    }
        //发起网络请求
        public void request(){
            //步骤四:创建retrofit对象
            Retrofit retrofit = new Retrofit.Builder().baseUrl("http://fy.iciba.com/").addConverterFactory(GsonConverterFactory.create()).build();
            // 步骤5:创建 网络请求接口 的实例
            GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
            //对 发送请求 进行封装
            Call<Translation> call = request.getCall();
            //步骤六:发送网络请求(异步)
            call.enqueue(new Callback<Translation>() {
                @Override
                public void onResponse(Call<Translation> call, Response<Translation> response) {
                    // 步骤7：处理返回的数据结果
                    response.body().show();
                }

                @Override
                public void onFailure(Call<Translation> call, Throwable t) {

                    System.out.println("连接失败");
                    t.printStackTrace();
                }
            });





        }



}
