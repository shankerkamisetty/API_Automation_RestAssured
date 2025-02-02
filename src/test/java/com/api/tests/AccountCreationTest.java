package com.api.tests;

import com.api.model.request.SignUpRequest;
import com.api.services.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

//@Test
public class AccountCreationTest {

    public void signUp() {

        AuthService authService = new AuthService();

        SignUpRequest signUpRequest = new SignUpRequest.SignUpRequestBuilder()
                .buildUsername("sktest1234")
                .buildPassword("sktest1234")
                .buildFirstName("SK")
                .buildLastName("Test")
                .buildEmail("skautomate7@gmail.com")
                .buildMobileNumber("9123456789")
                .build();

        Response response = authService.signup(signUpRequest);


    }


}
