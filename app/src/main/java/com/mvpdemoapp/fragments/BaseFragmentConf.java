package com.mvpdemoapp.fragments;

public interface BaseFragmentConf {

    interface View{

        void attachPresenter(Presenter presenter);
    }

    interface Presenter{

        void addFragment(BaseFragment fragment);
    }
}
