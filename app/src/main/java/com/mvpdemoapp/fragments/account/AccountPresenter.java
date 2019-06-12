package com.mvpdemoapp.fragments.account;

public class AccountPresenter implements AccountConf.Presenter {

    private AccountConf.View view;

    public AccountPresenter(AccountConf.View view) {
        this.view = view;
    }

    @Override
    public void defaultSettings() {

    }

    @Override
    public void SetOnButtonClick(String message) {
        view.showOnButtonClick(message);
    }

    @Override
    public void loadNewFragment() {

    }
}
