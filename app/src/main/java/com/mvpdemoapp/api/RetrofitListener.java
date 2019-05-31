package com.mvpdemoapp.api;

import retrofit2.Response;

public interface RetrofitListener {

    void onSuccess(Response response, String method);
    void onFailure(String message);

}
