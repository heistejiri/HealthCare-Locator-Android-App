package com.heistejiri.hospitallocator.rest_api;

import com.heistejiri.hospitallocator.models.DetailResult;
import com.heistejiri.hospitallocator.models.DistanceResult;
import com.heistejiri.hospitallocator.models.PlaceList;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;



public interface HospitalListClient {

    @GET("place/nearbysearch/json")
    Call<PlaceList> getNearbyHospitals (@QueryMap Map<String,String> params);

    @GET("distancematrix/json")
    Call<DistanceResult> getHospitalDistances(@QueryMap Map<String,String> params);

    @GET("place/details/json")
    Call<DetailResult> getHospitalDetails(@QueryMap Map<String ,String> params);
}
