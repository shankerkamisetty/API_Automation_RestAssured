package com.api.tests;

import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;
import com.api.services.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginAPITest {

    //    @Test(description = "Verify if login API is working")
    public void loginTest_BeforeWrapper() {

        Response response =
                given()
                        .baseUri("http://64.227.160.186:8080")
                        .header("Content-Type",
                                "application/json")
                        .body("""
                                {
                                  "username": "kamisettyj75",
                                  "password": "g@Dt3K@FDFK7c9K"
                                }""")
                        .post("/api/auth/login");

        Assert.assertEquals(response.statusCode(), 200);

    }

    @Test(description = "Verify if login API is working")
    public void loginTest() {

        AuthService authService = new AuthService();
        LoginRequest loginRequest = new LoginRequest.LoginRequestBuilder()
                .buildUsername("kamisettyj75")
                .buildPassword("g@Dt3K@FDFK7c9K")
                .build();

        Response response = authService.login(loginRequest);
        //convert the JSON to java using .as
        LoginResponse loginResponse = response.as(LoginResponse.class);

        Assert.assertEquals(response.statusCode(), 200);

    }
}
