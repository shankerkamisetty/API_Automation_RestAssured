package com.api.services;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Wrapper for RestAssured
public class BaseService {

    //    BASE URI
    private static final String BASE_URL = "http://64.227.160.186:8080";

    //    CREATING REQUEST
    private final RequestSpecification requestSpecification;

    public BaseService() {
        this.requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    //Set authToken to header
    public void setAuthToken(String authToken) {
        requestSpecification
                .header("Authorization", "Bearer " + authToken);
    }

    //    HANDLING REQUESTS
    //POST Request
    public Response postRequest(Object payload, String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .post(endpoint);
    }

    //PUT Request
    public Response putRequest(Object payload, String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .put(endpoint);
    }

    //GET Request
    public Response getRequest(String endpoint) {
        return requestSpecification
                .get(endpoint);
    }


}
