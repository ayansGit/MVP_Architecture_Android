package com.mvpdemoapp.dashboard;

import android.content.Context;
import android.widget.EditText;

import com.mvpdemoapp.api.Method;
import com.mvpdemoapp.api.RestHandler;
import com.mvpdemoapp.api.RetrofitListener;
import com.mvpdemoapp.apiModels.login.LoginResponse;
import com.mvpdemoapp.login.LoginConf;
import com.mvpdemoapp.login.LoginModel;
import com.mvpdemoapp.validator.Type;
import com.mvpdemoapp.validator.Validate;
import com.mvpdemoapp.validator.Validator;

import retrofit2.Response;

public class DashboardPresenter implements DashboardConf.Presenter, RetrofitListener {

    DashboardConf.View view;
    LoginModel loginModel;
    Context context;
    RestHandler restHandler;

    public DashboardPresenter(DashboardConf.View view, Context context) {
        this.view = view;
        this.context = context;
        loginModel = new LoginModel();
        restHandler = new RestHandler(this, context);
    }

    @Override
    public void defaultSettings() {

        view.hideLoader();
    }

    @Override
    public void callCompanyList() {

    }


    @Override
    public void loadNextScreen() {

    }


    @Override
    public void onSuccess(Response response, Method method) {

        view.hideLoader();
        switch (method) {
            case LOGIN:
                LoginResponse loginResponse = (LoginResponse) response.body();
                if (loginResponse != null) {
                    if (loginResponse.getStatus() == 200){
                        view.showSuccessMessage(loginResponse.getMessage());
                    }else {
                        view.showError(loginResponse.getMessage());
                    }

                }
                break;
        }
    }

    @Override
    public void onFailure(String message) {

        view.hideLoader();
        view.showError(message);
    }
}
