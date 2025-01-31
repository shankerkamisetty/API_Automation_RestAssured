package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.model.request.UpdateUserProfileRequest;
import com.api.model.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateUserProfileTest {

    @Test(description = "Verify PUT Request to update user profile is working")
    public void userProfileTest() {

        String token = AuthService.getAuthToken();

        UserManagementService userManagementService = new UserManagementService();

        UpdateUserProfileRequest updateRequestPayload = new UpdateUserProfileRequest.UpdateProfileRequestBuilder()
                .buildFirstName("Shanker")
                .buildLastName("Kamisetty")
                .buildEmail("jyothinba@gmail.com")
                .buildMobileNumber("9123456789")
                .build();
        Response response = userManagementService.updateProfile(updateRequestPayload, token);
        UserProfileResponse profileResponse = response.as(UserProfileResponse.class);

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(profileResponse.getMobileNumber(), "9123456789");

    }


}
