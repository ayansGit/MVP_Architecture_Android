package com.mvpdemoapp.fragments.cart;

public class CartPresenter implements CartConf.Presenter {

    private CartConf.View view;

    public CartPresenter(CartConf.View view) {
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
