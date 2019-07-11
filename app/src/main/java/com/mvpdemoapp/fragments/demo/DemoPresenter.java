package com.mvpdemoapp.fragments.demo;


public class DemoPresenter implements DemoConf.Presenter {

    private DemoConf.View view;

    public DemoPresenter(DemoConf.View view) {
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
