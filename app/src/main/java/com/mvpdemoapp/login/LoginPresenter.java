package com.mvpdemoapp.login;

import android.widget.EditText;

import com.mvpdemoapp.validator.Type;
import com.mvpdemoapp.validator.Validate;
import com.mvpdemoapp.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class LoginPresenter implements LoginConf.Presenter, Validate.OnValidate {

    LoginConf.View view;
    LoginModel loginModel;
    List<Validator> validatorList;

    public LoginPresenter(LoginConf.View view) {
        this.view = view;
        loginModel = new LoginModel();
        validatorList = new ArrayList<>();
    }

    @Override
    public void defaultSettings() {

        view.hideLoader();
    }

    @Override
    public void addValidator(EditText editText, Type type) {

       Validator validator = new Validator(editText,type);
       validatorList.add(validator);
    }

    @Override
    public void validateField(String value, Type type) {

        new Validate(value, type, this);

    }

    @Override
    public void validateField(String value, Type type, Integer id) {

        new Validate(value, type, id,this);
    }

    @Override
    public void validateOnSubmit() {

        for(Validator validator: validatorList){
            validateField(validator.getEditText().getText().toString().trim(),validator.getType(),validator.getEditText().getId());
        }
    }


    @Override
    public void doLogin(String username, String password) {

    }

    @Override
    public void loadNextScreen() {

    }

    @Override
    public void setOnValidateSuccess(Type type) {

    }

    @Override
    public void setOnValidateSuccess(Type type, Integer id) {

    }

    @Override
    public void setOnValidateError(Type type, String message) {

    }

    @Override
    public void setOnValidateError(Type type, Integer id, String message) {

    }
}
