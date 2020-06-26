package com.example.covid_19ksa;
import com.example.covid_19ksa.BuildConfig;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://covid-193.p.rapidapi.com/";

    @Headers({"x-rapidapi-host: covid-193.p.rapidapi.com",
            "x-rapidapi-key: " + BuildConfig.API_KEY})
    @GET("statistics")
    Call<Case> getCases(@Query("country") String country);
}
