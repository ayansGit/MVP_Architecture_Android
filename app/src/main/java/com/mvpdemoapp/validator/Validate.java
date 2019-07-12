package com.mvpdemoapp.validator;

import android.content.Context;

import com.mvpdemoapp.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {


    private String value;
    private Type type;
    private Integer id;
    private OnValidate onValidate;
    private Context context;

    public Validate(OnValidate onValidate) {
    }

    public Validate(Context context, String value, Type type, OnValidate onValidate) {
        this.context = context;
        this.value = value;
        this.type = type;
        this.onValidate = onValidate;
        //validate();
    }

    public Validate(Context context, String value, Type type, Integer id, OnValidate onValidate) {
        this.context = context;
        this.value = value;
        this.type = type;
        this.id = id;
        this.onValidate = onValidate;
        //validate();
    }

    public interface OnValidate {
        void setOnValidateSuccess(Type type);

        void setOnValidateSuccess(Type type, Integer id);

        void setOnValidateError(Type type, String message);

        void setOnValidateError(Type type, Integer id, String message);
    }


    public Boolean validate() {
        Boolean isValid = false;
        switch (type) {

            case EMAIL:
                String EMAIL_PATTERN =
                        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                Matcher matcher = pattern.matcher(value);
                if(value.trim().isEmpty()){
                    isValid = false;
                    onValidate.setOnValidateError(type,id,context.getResources().getString(R.string.emptyEmail));
                    onValidate.setOnValidateError(type,context.getResources().getString(R.string.emptyEmail));
                }else if(!matcher.matches()){
                    isValid = false;
                    onValidate.setOnValidateError(type,id,context.getResources().getString(R.string.validEmail));
                    onValidate.setOnValidateError(type,context.getResources().getString(R.string.validEmail));
                }else {
                    isValid = true;
                    onValidate.setOnValidateSuccess(type,id);
                    onValidate.setOnValidateSuccess(type);
                }
                break;

            case PASSWORD:
                
                if(value.trim().isEmpty()){
                    isValid = false;
                    onValidate.setOnValidateError(type,id,context.getResources().getString(R.string.emptyPasswordMessage));
                    onValidate.setOnValidateError(type,context.getResources().getString(R.string.emptyPasswordMessage));
                }else {
                    isValid = true;
                    onValidate.setOnValidateSuccess(type,id);
                    onValidate.setOnValidateSuccess(type);
                }
                break;

            case USERNAME:

                String PATTERN = "^[a-zA-Z]*$";
                Pattern usernamePattern = Pattern.compile(PATTERN);
                Matcher usernameMatcher = usernamePattern.matcher(value);
                if(!usernameMatcher.matches()){
                    isValid = false;
                    onValidate.setOnValidateError(type,id,context.getResources().getString(R.string.validUsernameMessage));
                    onValidate.setOnValidateError(type,context.getResources().getString(R.string.validUsernameMessage));
                }else if(value.trim().isEmpty()){
                    isValid = false;
                    onValidate.setOnValidateError(type,id,context.getResources().getString(R.string.emptyUsernameMessage));
                    onValidate.setOnValidateError(type,context.getResources().getString(R.string.emptyUsernameMessage));
                }else {
                    isValid = true;
                    onValidate.setOnValidateSuccess(type,id);
                    onValidate.setOnValidateSuccess(type);
                }
                break;
        }

        return isValid;
    }

    /**
     * This method if for test case to validate email given by the user
     * @return boolean value
     */
    public static boolean validateEmail(String value){
        Boolean isValid = false;
        String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(value);
        if(value.trim().isEmpty()){
            isValid = false;
            return isValid;
        }else if(!matcher.matches()){
            isValid = false;
            return isValid;
        }else {
            isValid = true;
            return isValid;
        }

    }

    /**
     * This method if for test case to validate password given by the user
     * @return boolean value
     */
    public static boolean validatePassword(String value){
        Boolean isValid = false;
        if(value.trim().isEmpty()){
            isValid = false;
            return isValid;
        }else {
            isValid = true;
            return isValid;
        }

    }

    /**
     * This method if for test case to validate username given by the user
     * @return boolean value
     */
    public static boolean validateUsername(String value){
        Boolean isValid = false;
        String PATTERN = "^[a-zA-Z]*$";
        Pattern usernamePattern = Pattern.compile(PATTERN);
        Matcher usernameMatcher = usernamePattern.matcher(value);
        if(!usernameMatcher.matches()){
            isValid = false;
            return isValid;
        }else if(value.trim().isEmpty()){
            isValid = false;
            return isValid;
        }else {
            isValid = true;
            return isValid;
        }

    }


}
