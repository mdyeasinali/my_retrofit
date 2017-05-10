/*
 * Created by Shaon on 8/15/16 8:06 PM
 * Copyright (c) 2016. This is free to use in any software.
 * You must provide developer name on your project.
 */

package org.mytriangle.com.myretrofit2.service;

import org.mytriangle.com.myretrofit2.model.People;

import java.util.List;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Shaon on 8/15/2016.
 */
public interface APIService {
    @GET("my_json")
    Call<List<People>> getPeopleDetails();

    @FormUrlEncoded
    @POST("my_json/insertUsingRetrofit.php")
    Call<People> setPeopleDetails(@Field("name") String name);
}
