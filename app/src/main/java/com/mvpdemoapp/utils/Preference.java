package com.mvpdemoapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {

    Context context;
    SharedPreferences sharedPreferences ;
    SharedPreferences.Editor editor;

    public Preference(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(Constants.PREFERENCE, Context.MODE_PRIVATE);
    }

    public void clearPreference(){
        editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }

    private void putString(String key, String value){
        editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.commit();
    }

    private String getString(String key){
        return sharedPreferences.getString(key,"");
    }

    private void putInt(String key, int value){
        editor = sharedPreferences.edit();
        editor.putInt(key,value);
        editor.commit();
    }

    private int getInt(String key){
        return sharedPreferences.getInt(key,0);
    }

    private void putBoolean(String key, boolean value){
        editor = sharedPreferences.edit();
        editor.putBoolean(key,value);
        editor.commit();
    }

    private boolean getBoolean(String key){
        return sharedPreferences.getBoolean(key,false);
    }



    public void setUserId(String value){
        putString(Constants.USER_ID,value);
    }

    public String getUserId(){
        return getString(Constants.USER_ID);
    }

    public void setAccessToken(String value){
        putString(Constants.ACCESS_TOKEN,value);
    }

    public String getAccessToken(){
        return getString(Constants.ACCESS_TOKEN);
    }

}
