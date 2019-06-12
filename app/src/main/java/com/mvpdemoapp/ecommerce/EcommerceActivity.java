package com.mvpdemoapp.ecommerce;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.mvpdemoapp.R;
import com.mvpdemoapp.fragments.BaseFragment;
import com.mvpdemoapp.fragments.BaseFragmentConf;

public class EcommerceActivity extends AppCompatActivity implements EcommerceConf.View, BottomNavigationView.OnNavigationItemSelectedListener {

    private EcommerceConf.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecommerce);

        presenter = new EcommercePresenter(this);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        navigation.setOnNavigationItemSelectedListener(this);

        presenter.defaultSettings();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){

            case R.id.store:
                presenter.getStoreFragment();
                return true;

            case R.id.cart:
                presenter.getCartFragment();
                return true;

            case R.id.account:
                return true;
        }
        return false;
    }

    @Override
    public void setFragment(BaseFragment fragment) {

        fragment.attachPresenter((BaseFragmentConf.Presenter) presenter);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        //trans.remove(fragment);
        trans.replace(R.id.container,fragment);
        trans.commit();
        manager.popBackStack();

//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.container,fragment)
//                .commit();
    }

    @Override
    public void addFragment(BaseFragment fragment) {
        fragment.attachPresenter((BaseFragmentConf.Presenter) presenter);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit();
    }
}
