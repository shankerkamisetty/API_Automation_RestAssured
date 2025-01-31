package com.api.tests;

import com.api.base.AuthService;
import com.api.model.request.SignUpRequest;
import io.restassured.response.Response;

public class AccountCreationTest {

    public void signUp() {

        AuthService authService = new AuthService();

        SignUpRequest signUpRequest = new SignUpRequest.SignUpRequestBuilder()
                .getSetUsername("adi1234")
                .getSetPassword("adi1234")
                .getSetFirstName("Adi")
                .getSetLastName("Test")
                .getSetEmail("test@test.com")
                .getSetMobileNumber("9123456789")
                .build();

        Response response = authService.signup(signUpRequest);


    }


}
