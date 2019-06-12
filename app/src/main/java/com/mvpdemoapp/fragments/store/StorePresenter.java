package com.mvpdemoapp.fragments.store;

public class StorePresenter implements StoreConf.Presenter{

    StoreConf.View view;

    public StorePresenter(StoreConf.View view) {
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
