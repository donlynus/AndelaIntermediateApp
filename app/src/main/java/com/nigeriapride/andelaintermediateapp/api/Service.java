package com.nigeriapride.andelaintermediateapp.api;

import com.nigeriapride.andelaintermediateapp.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by auztyn on 8/6/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
