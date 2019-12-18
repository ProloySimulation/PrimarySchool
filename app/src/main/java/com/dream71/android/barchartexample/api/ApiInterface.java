package com.dream71.android.barchartexample.api;

import com.dream71.android.barchartexample.pojo.PiChart;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;


/**
 * Created by android on 9/29/2017.
 */

public interface ApiInterface {
    @GET("chart.json")
    Call<PiChart> init();
}