package com.mvpdemoapp.fragments.account;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.mvpdemoapp.R;
import com.mvpdemoapp.fragments.BaseFragment;

public class AccountFragment extends BaseFragment implements AccountConf.View {
    @Override
    protected int getLayout() {
        return R.layout.fragment_account;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLoader() {

    }

    @Override
    public void hideLoader() {

    }

    @Override
    public void showSuccessMessage(String message) {

    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void showOnButtonClick(String message) {

    }

    @Override
    public void openNewPage() {

    }
}
