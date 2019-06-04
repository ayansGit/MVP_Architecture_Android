package com.mvpdemoapp.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {


    private String value;
    private Type type;
    private Integer id;
    private OnValidate onValidate;

    public Validate(OnValidate onValidate) {
    }

    public Validate(String value, Type type, OnValidate onValidate) {
        this.value = value;
        this.type = type;
        validate();
    }

    public Validate(String value, Type type, Integer id, OnValidate onValidate) {
        this.value = value;
        this.type = type;
        this.id = id;
        validate();
    }

    public interface OnValidate {
        void setOnValidateSuccess(Type type);

        void setOnValidateSuccess(Type type, Integer id);

        void setOnValidateError(Type type, String message);

        void setOnValidateError(Type type, Integer id, String message);
    }


    private void validate() {
        switch (type) {
            case EMAIL:
                String EMAIL_PATTERN =
                        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                Matcher matcher = pattern.matcher(value);
                if(value.trim().isEmpty()){
                    onValidate.setOnValidateError(type,id,"Please enter your email");
                    onValidate.setOnValidateError(type,"Please enter your email");
                }else if(!matcher.matches()){
                    onValidate.setOnValidateError(type,id,"Please enter valid email");
                    onValidate.setOnValidateError(type,"Please enter valid email");
                }else {
                    onValidate.setOnValidateSuccess(type,id);
                    onValidate.setOnValidateSuccess(type);
                }
                break;

            case PASSWORD:

                if(value.trim().isEmpty()){
                    onValidate.setOnValidateError(type,id,"Please enter your password");
                    onValidate.setOnValidateError(type,"Please enter your password");
                }else {
                    onValidate.setOnValidateSuccess(type,id);
                    onValidate.setOnValidateSuccess(type);
                }
                break;

            case USERNAME:

                if(value.trim().isEmpty()){
                    onValidate.setOnValidateError(type,id,"Please enter your username");
                    onValidate.setOnValidateError(type,"Please enter your username");
                }else {
                    onValidate.setOnValidateSuccess(type,id);
                    onValidate.setOnValidateSuccess(type);
                }
                break;
        }
    }


}
