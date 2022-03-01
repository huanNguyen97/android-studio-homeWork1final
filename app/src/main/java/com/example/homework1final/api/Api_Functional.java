package com.example.homework1final.api;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.Request;
import com.example.homework1final.api.elements.Api_Response;

public class Api_Functional extends Api_Variable {
    public Api_Functional(Context context) {
        super(context);
    }

    public void getDataFromAPI(
        TextView textView1,
        TextView textView2,
        TextView textView3,
        TextView textView4,
        TextView textView5,
        TextView textView6,
        TextView textView7
    ) {
        Api_Response api_getter = new Api_Response(context);
        api_getter.getAllResponse(
            Request.Method.GET,
            null,
            new Api_Variable.VolleyCallback() {
                @Override
                public void onFirstNameSuccessResponse(String result) {
                    String response = new String(result.toString());
                    textView1.setText(response.toString());
                }

                @Override
                public void onLastNameSuccessResponse(String result) {
                    String response = new String(result.toString());
                    textView2.setText(response.toString());
                }

                @Override
                public void onDobSuccessResponse(String result) {
                    String response = new String(result.toString());
                    textView3.setText(response.toString());
                }

                @Override
                public void onAddressSuccessResponse(String result) {
                    String response = new String(result.toString());
                    textView4.setText(response.toString());
                }

                @Override
                public void onPhoneNumberSuccessResponse(String result) {
                    String response = new String(result.toString());
                    textView5.setText(response.toString());
                }

                @Override
                public void onPasswordSuccessResponse(String result) {
                    String response = new String(result.toString());
                    textView6.setText(response.toString());
                }

                @Override
                public void onEmailSuccessResponse(String result) {
                    String response = new String(result.toString());
                    textView7.setText(response.toString());
                }
            }
        );
    }
}
