package com.api.base;


import com.api.model.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Wrapper for RestAssured
public class BaseService {

    //    BASE URI
    private static final String BASE_URL = "http://64.227.160.186:8080";

    //    CREATING REQUEST
    private RequestSpecification requestSpecification;

    public BaseService() {
        this.requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    //    HANDLING RESPONSE
    public Response postRequest(Object payload, String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .post(endpoint);
    }


}
