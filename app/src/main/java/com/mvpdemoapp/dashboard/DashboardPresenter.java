package com.mvpdemoapp.dashboard;

import android.content.Context;
import android.widget.Toast;

import com.mvpdemoapp.adapter.company.CompanyAdapter;
import com.mvpdemoapp.adapter.company.CompanyAdapterConfig;
import com.mvpdemoapp.api.Method;
import com.mvpdemoapp.api.RestHandler;
import com.mvpdemoapp.api.RetrofitListener;
import com.mvpdemoapp.apiModels.companyList.CompanyData;
import com.mvpdemoapp.apiModels.companyList.CompanyListResponse;
import com.mvpdemoapp.apiModels.login.LoginResponse;
import com.mvpdemoapp.login.LoginModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

public class DashboardPresenter implements DashboardConf.Presenter, RetrofitListener, CompanyAdapterConfig.OnItemClickListener {

    private DashboardConf.View view;
    private LoginModel loginModel;
    private Context context;
    private RestHandler restHandler;
    private CompanyAdapter companyAdapter;
    private List<CompanyData> companyDataList;


    public DashboardPresenter(DashboardConf.View view, Context context) {
        this.view = view;
        this.context = context;
        loginModel = new LoginModel();
        restHandler = new RestHandler(this, context);
        companyDataList = new ArrayList<>();
        companyAdapter = new CompanyAdapter(context, companyDataList, this);
    }

    @Override
    public void defaultSettings() {

        view.hideLoader();
        view.setRecyclerAdapter(companyAdapter);
    }

    @Override
    public void getCompanyList() {

        view.showLoader();
        restHandler.makeHttpRequest(restHandler.getClient().getCompany(), Method.GET_COMPANY);
    }


    @Override
    public void loadNextScreen() {
        view.navigateToNextPage();
    }


    @Override
    public void onSuccess(Response response, Method method) {

        view.hideLoader();

        switch (method) {
            case GET_COMPANY:
                CompanyListResponse companyListResponse = (CompanyListResponse) response.body();
                if (companyListResponse != null && companyListResponse.getStatus() == 200) {
                    if(companyListResponse.getData()!= null && companyListResponse.getData().size()>0){
                        companyDataList.clear();
                        companyDataList.addAll(companyListResponse.getData());
                        companyAdapter.notifyDataSetChanged();
                    }
                    view.showSuccessMessage(companyListResponse.getMessage());
                } else {
                    view.showError(companyListResponse.getMessage());
                }

                break;
        }
    }

    @Override
    public void onFailure(String message) {

        view.hideLoader();
        view.showError(message);
    }

    @Override
    public void setOnItemClickListener(CompanyData companyData) {

        loadNextScreen();
    }
}
