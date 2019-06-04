package com.mvpdemoapp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mvpdemoapp.R;
import com.mvpdemoapp.validator.Type;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginConf.View{


    private LoginConf.Presenter presenter;
    private EditText etUsername;
    private EditText etPassword;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btLogin = (Button)findViewById(R.id.btLogin);

        presenter = new LoginPresenter(this);
        etUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presenter.validateField(etUsername.getText().toString().trim(), Type.USERNAME,etUsername.getId());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presenter.validateField(etPassword.getText().toString().trim(), Type.PASSWORD,etPassword.getId());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btLogin:

                break;
        }
    }


    @Override
    public void showLoader() {

    }

    @Override
    public void hideLoader() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showValidationError(String message, Integer id) {

    }

    @Override
    public void navigateToNextPage() {

    }

}
