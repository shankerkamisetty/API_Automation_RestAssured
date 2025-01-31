package com.api.base;

import io.restassured.response.Response;


public class UserManagementService extends BaseService {

    private static final String BASE_PATH = "/api/users/";

    public Response getProfile(String authToken) {
        setAuthToken(authToken);
        return getRequest(BASE_PATH + "profile");

    }

    public Response updateProfile(Object payload, String authToken) {
        setAuthToken(authToken);
        return putRequest(payload, BASE_PATH + "profile");
    }


}
