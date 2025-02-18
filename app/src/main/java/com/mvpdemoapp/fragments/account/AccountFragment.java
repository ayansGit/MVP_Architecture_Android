package com.mvpdemoapp.fragments.account;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.mvpdemoapp.R;
import com.mvpdemoapp.fragments.BaseFragment;
import com.mvpdemoapp.fragments.demo.DemoFragment;

public class AccountFragment extends BaseFragment implements AccountConf.View {

    Button btClickHere;

    @Override
    protected int getLayout() {
        return R.layout.fragment_account;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        btClickHere = view.findViewById(R.id.btClickHere);
        btClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.addFragment(new DemoFragment());
            }
        });

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
