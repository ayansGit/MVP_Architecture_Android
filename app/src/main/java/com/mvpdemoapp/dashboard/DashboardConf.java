package com.mvpdemoapp.dashboard;

import android.widget.EditText;

import com.mvpdemoapp.validator.Type;

public interface DashboardConf {

    interface View{

        void showLoader();
        void hideLoader();
        void showSuccessMessage(String message);
        void showError(String message);
        void navigateToNextPage();
    }

    interface Presenter{

        void defaultSettings();
        void callCompanyList();
        void loadNextScreen();
    }
}
