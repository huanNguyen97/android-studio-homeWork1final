package com.example.homework1final.api;

import android.content.Context;

import org.json.JSONObject;

public class Api_Variable {
    // Initialize variable
    public final String url = "https://randomuser.me/api/0.4/?randomapi";
    public Context context;
    // End

    // Interface
    public interface VolleyCallback {
        void onFirstNameSuccessResponse(String result);
        void onLastNameSuccessResponse(String result);
        void onDobSuccessResponse(String result);
        void onAddressSuccessResponse(String result);
        void onPhoneNumberSuccessResponse(String result);
        void onPasswordSuccessResponse(String result);
        void onEmailSuccessResponse(String result);
    }
    // End interface

    // Constructor
    public Api_Variable(Context context) {
        this.context = context;
    }
    // End

    // Getter and Setter
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    // End
}
