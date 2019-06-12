package com.mvpdemoapp.ecommerce;

import com.mvpdemoapp.fragments.BaseFragment;

public interface EcommerceConf {

    interface View{
        void setFragment(BaseFragment fragment);
        void addFragment(BaseFragment fragment);
    }
    interface Presenter{
        void defaultSettings();
        void getStoreFragment();
        void getCartFragment();
    }

}
