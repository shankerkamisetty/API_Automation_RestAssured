package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;

public class ForgotPasswordTest {

    //    @Test(description = "Verify Forgot Password API is working")
    public void forgotPassTest() {

        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("jyothinba@gmail.com");

        Assert.assertEquals(response.statusCode(), 200);

    }
}
