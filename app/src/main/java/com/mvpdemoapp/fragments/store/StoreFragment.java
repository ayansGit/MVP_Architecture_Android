package com.mvpdemoapp.fragments.store;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mvpdemoapp.R;
import com.mvpdemoapp.fragments.BaseFragment;
import com.mvpdemoapp.fragments.account.AccountFragment;
import com.mvpdemoapp.fragments.cart.CartFragment;

public class StoreFragment extends BaseFragment implements StoreConf.View, View.OnClickListener {

    private Button btClickHere;
    private StoreConf.Presenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_store;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        btClickHere = view.findViewById(R.id.btClickHere);
        btClickHere.setOnClickListener(this);

        presenter = new StorePresenter(this);
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

        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void openNewPage() {

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btClickHere:
                presenter.SetOnButtonClick("Store");
                super.presenter.addFragment(new AccountFragment());
                break;
        }
    }
}
