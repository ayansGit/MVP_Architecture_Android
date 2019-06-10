package com.mvpdemoapp.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mvpdemoapp.R;
import com.mvpdemoapp.adapter.company.CompanyAdapter;
import com.mvpdemoapp.ecommerce.EcommerceActivity;

public class DashboardActivity extends AppCompatActivity implements DashboardConf.View {

    private DashboardConf.Presenter     presenter;
    private RecyclerView                rvCompanyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        presenter = new DashboardPresenter(this,this);
        rvCompanyList = (RecyclerView)findViewById(R.id.rvCompanyList);
        rvCompanyList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        presenter.defaultSettings();
        presenter.getCompanyList();
    }

    @Override
    public void showLoader() {
        findViewById(R.id.loader).setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoader() {
        findViewById(R.id.loader).setVisibility(View.GONE);
    }

    @Override
    public void setRecyclerAdapter(CompanyAdapter adapter) {

        rvCompanyList.setAdapter(adapter);
    }

    @Override
    public void showSuccessMessage(String message) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void navigateToNextPage() {

        Intent intent = new Intent(this, EcommerceActivity.class);
        startActivity(intent);
    }
}
