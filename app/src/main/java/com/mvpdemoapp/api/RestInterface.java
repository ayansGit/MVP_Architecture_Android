package com.mvpdemoapp.api;

import com.mvpdemoapp.apiModels.companyList.CompanyListResponse;
import com.mvpdemoapp.apiModels.login.LoginResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestInterface {

    @POST("user/signin")
    @FormUrlEncoded
    Call<LoginResponse> login(@Field(value = "username", encoded = true) String username,
                              @Field(value = "password", encoded = true) String password,
                              @Field(value = "device_token", encoded = true) String deviceToken,
                              @Field(value = "device_type", encoded = true) String deviceType);
    @GET("company/list")
    Call<CompanyListResponse> getCompany();

}
