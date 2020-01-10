package com.classpractice.foodmandu.Api;

import com.classpractice.foodmandu.Model.Cafe;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface CafeAPI {

    @GET("cafe/all")
    Call<Cafe> getAllResturant();

    @POST("cafe/create")
    Call<Cafe> insertResturant(@Body Cafe resturant, @Header("Authorization") String token);
}
