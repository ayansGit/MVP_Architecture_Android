package com.mvpdemoapp.fragments.cart;

public interface CartConf {
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
