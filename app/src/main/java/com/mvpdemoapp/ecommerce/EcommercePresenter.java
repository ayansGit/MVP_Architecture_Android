package com.mvpdemoapp.ecommerce;

import android.content.Context;

import com.mvpdemoapp.fragments.BaseFragment;
import com.mvpdemoapp.fragments.BaseFragmentConf;
import com.mvpdemoapp.fragments.cart.CartFragment;
import com.mvpdemoapp.fragments.store.StoreFragment;

public class EcommercePresenter implements EcommerceConf.Presenter, BaseFragmentConf.Presenter {

    EcommerceConf.View view;

    public EcommercePresenter(EcommerceConf.View view) {
        this.view = view;
    }



    @Override
    public void addFragment(BaseFragment fragment) {
        view.addFragment(fragment);
    }

    @Override
    public void defaultSettings() {

        view.setFragment(new StoreFragment());
    }

    @Override
    public void getStoreFragment() {
        view.setFragment(new StoreFragment());
    }

    @Override
    public void getCartFragment() {
        view.setFragment(new CartFragment());
    }
}
