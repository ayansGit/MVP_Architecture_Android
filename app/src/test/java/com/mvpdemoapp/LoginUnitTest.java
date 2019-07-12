package com.mvpdemoapp;

import android.content.Context;

import com.mvpdemoapp.api.Method;
import com.mvpdemoapp.api.RestHandler;
import com.mvpdemoapp.api.RetrofitListener;
import com.mvpdemoapp.apiModels.login.LoginResponse;
import com.mvpdemoapp.validator.Validate;
import com.mvpdemoapp.validator.Validator;

import org.junit.Test;
import org.mockito.Mock;

import retrofit2.Response;

import static org.junit.Assert.assertTrue;


public class LoginUnitTest {

    @Mock
    Context context;

    @Test
    public void isUsernameValid() {
        assertTrue(Validate.validateUsername("abc"));
    }

    @Test
    public void isPasswordValid() {
        assertTrue(Validate.validatePassword("123456"));
    }

}
