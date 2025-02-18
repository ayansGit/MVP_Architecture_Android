package com.mvpdemoapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment implements BaseFragmentConf.View{

    protected BaseFragmentConf.Presenter presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(getLayout(),container,false);
        return rootView;
    }

    protected abstract int getLayout();

    @Override
    public void attachPresenter(BaseFragmentConf.Presenter presenter) {
        this.presenter = presenter;
    }
}
