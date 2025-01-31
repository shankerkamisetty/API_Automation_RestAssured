package com.api.tests;

import com.api.model.request.SignUpRequest;
import com.api.services.AuthService;
import io.restassured.response.Response;

//@Test
public class AccountCreationTest {

    public void signUp() {

        AuthService authService = new AuthService();

        SignUpRequest signUpRequest = new SignUpRequest.SignUpRequestBuilder()
                .buildUsername("adi1234")
                .buildPassword("adi1234")
                .buildFirstName("Adi")
                .buildLastName("Test")
                .buildEmail("test@test.com")
                .buildMobileNumber("9123456789")
                .build();

        Response response = authService.signup(signUpRequest);


    }


}
