package com.example.newsapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIinterface {
    String BASE_URL="https://newsapi.org/v2/";

@GET("top-headlines")
    Call<NewsClass> getNews(
            @Query("country") String country,
            @Query("pageSize") int pageSize,
            @Query("apiKey")   String apiKey
);
    @GET("top-headlines")
    Call<NewsClass> getCategoryName

            (
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pageSize,
            @Query("apiKey")   String apiKey
    );
}
