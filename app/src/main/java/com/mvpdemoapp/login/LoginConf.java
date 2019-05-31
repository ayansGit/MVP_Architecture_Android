package com.mvpdemoapp.login;

public interface LoginConf {

    interface View{

        void showLoader();
        void hideLoader();
        void showError(String message);
        void navigateToNextPage();
    }

    interface Presenter{

        void defaultSettings();
        void doLogin(String username, String password);
        void loadNextScreen();
    }
}
