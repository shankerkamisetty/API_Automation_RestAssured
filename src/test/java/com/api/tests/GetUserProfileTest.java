package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.model.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserProfileTest {

    @Test
    public void userProfileTest() {

        String token = AuthService.getAuthToken();

        UserManagementService userManagementService = new UserManagementService();
        Response response = userManagementService.getProfile(token);
        UserProfileResponse profileResponse = response.as(UserProfileResponse.class);

        Assert.assertEquals(response.statusCode(), 200);

    }


}
