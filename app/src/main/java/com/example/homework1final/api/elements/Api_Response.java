package com.example.homework1final.api.elements;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.homework1final.api.Api_Variable;
import com.example.homework1final.model.VolleyAPI.MySingleton;

import org.json.JSONException;
import org.json.JSONObject;

public class Api_Response extends Api_Variable {

    public Api_Response(Context context) {
        super(context);
    }

    // Take Response
    public void getAllResponse(int method, JSONObject jsonValue, final VolleyCallback callback) {
        RequestQueue queue = MySingleton.getInstance(context).getRequestQueue();

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        // Take the name
                        // Take firstname
                        callback.onFirstNameSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getJSONObject("name")
                                .getString("first")
                        );
                        // End firstname

                        // Take lastname
                        callback.onLastNameSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getJSONObject("name")
                                .getString("last")
                        );
                        // End lastname
                        // End name

                        // Take email
                        callback.onEmailSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getString("email")
                        );
                        // End email

                        // Take Dob
                        callback.onDobSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getString("dob")
                        );
                        // End Dob

                        // Take Address
                        callback.onAddressSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getJSONObject("location")
                                .getString("street")
                        );
                        // End address

                        // Take phone number
                        callback.onPhoneNumberSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getString("phone")
                        );
                        // End phone number

                        // Take the password
                        callback.onPasswordSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getString("password")
                        );
                        // End password

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    // Error handle
                }
            }
        );

        MySingleton.getInstance(context).addToRequestQueue(jsonObjectRequest);
    }
    // End taking
}
