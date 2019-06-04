package com.mvpdemoapp.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvpdemoapp.R;

public class DashboardActivity extends AppCompatActivity implements DashboardConf.View {

    DashboardConf.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        presenter = new DashboardPresenter(this,this);
    }

    @Override
    public void showLoader() {

    }

    @Override
    public void hideLoader() {

    }

    @Override
    public void showSuccessMessage(String message) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void navigateToNextPage() {

    }
}
