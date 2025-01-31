package com.api.services;

import com.api.model.request.LoginRequest;
import com.api.model.request.SignUpRequest;
import com.api.model.response.LoginResponse;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService {
    private static final String BASE_PATH = "/api/auth/";

    public static String getAuthToken() {

        AuthService authService = new AuthService();
        LoginRequest loginRequest = new LoginRequest.LoginRequestBuilder()
                .buildUsername("kamisettyj75")
                .buildPassword("g@Dt3K@FDFK7c9K")
                .build();
        LoginResponse loginResponse = authService.login(loginRequest).as(LoginResponse.class);

        return loginResponse.getToken();
    }

    public Response login(LoginRequest payload) {
        return postRequest(payload, BASE_PATH + "login");
    }

    public Response signup(SignUpRequest payload) {
        return postRequest(payload, BASE_PATH + "signup");
    }

    public Response resetPassword(String payload) {
        return postRequest(payload, BASE_PATH + "reset-password");
    }

    public Response forgotPassword(String emailAddress) {
        HashMap<String, String> payload = new HashMap<>();
        payload.put("email", emailAddress);
        return postRequest(payload, BASE_PATH + "forgot-password");
    }
}
