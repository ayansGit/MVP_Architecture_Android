package com.mvpdemoapp.fragments.store;

import android.widget.EditText;

import com.mvpdemoapp.validator.Type;

public interface StoreConf {

    interface View{
        void showLoader();
        void hideLoader();
        void showSuccessMessage(String message);
        void showError(String error);
        void showOnButtonClick(String message);
        void openNewPage();
    }

    interface Presenter{
        void defaultSettings();
        void SetOnButtonClick(String message);
        void loadNewFragment();
    }
}
