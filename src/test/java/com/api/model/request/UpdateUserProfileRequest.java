package com.api.model.request;

public class UpdateUserProfileRequest {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;

    private UpdateUserProfileRequest(UpdateProfileRequestBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.mobileNumber = builder.mobileNumber;
        this.email = builder.email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class UpdateProfileRequestBuilder {
        private String firstName;
        private String lastName;
        private String mobileNumber;
        private String email;

        public UpdateProfileRequestBuilder buildFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UpdateProfileRequestBuilder buildLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UpdateProfileRequestBuilder buildMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UpdateProfileRequestBuilder buildEmail(String email) {
            this.email = email;
            return this;
        }

        public UpdateUserProfileRequest build() {
            return new UpdateUserProfileRequest(this);
        }
    }
}
