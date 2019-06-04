package com.mvpdemoapp.login;

import android.widget.EditText;

import com.mvpdemoapp.validator.Type;

public interface LoginConf {

    interface View{

        void showLoader();
        void hideLoader();
        void showError(String message);
        void showValidationError(String message, Integer id);
        void navigateToNextPage();
    }

    interface Presenter{

        void defaultSettings();
        void addValidator(EditText editText, Type type);
        void validateField(String value, Type type);
        void validateField(String value, Type type, Integer id);
        void validateOnSubmit();
        void doLogin(String username, String password);
        void loadNextScreen();
    }
}
