package com.api.base;

import com.api.model.request.LoginRequest;
import io.restassured.response.Response;

public class AuthService extends BaseService {
    private static final String BASE_PATH = "/api/auth/";

    public Response login(LoginRequest payload) {
        return postRequest(payload, BASE_PATH + "login");
    }

    /*public Response signup(String payload) {
        return postRequest(payload, BASE_PATH + "signup");
    }

    public Response resetPassword(String payload) {
        return postRequest(payload, BASE_PATH + "reset-password");
    }

    public Response forgotPassword(String payload) {
        return postRequest(payload, BASE_PATH + "forgot-password");
    }*/
}
