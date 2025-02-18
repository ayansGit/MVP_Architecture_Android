package com.mvpdemoapp.fragments.cart;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mvpdemoapp.R;
import com.mvpdemoapp.fragments.BaseFragment;

public class CartFragment extends BaseFragment implements CartConf.View , View.OnClickListener {

    private Button btClickHere;
    private CartConf.Presenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_cart;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        btClickHere = view.findViewById(R.id.btClickHere);
        btClickHere.setOnClickListener(this);

        presenter = new CartPresenter(this);
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

        presenter.SetOnButtonClick("Cart");
    }
}
