package com.api.model.request;

public class SignUpRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String mobileNumber;
    private String email;
    private String username;

    private SignUpRequest(SignUpRequestBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.mobileNumber = builder.mobileNumber;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public static class SignUpRequestBuilder {
        private String username;
        private String password;
        private String email;
        private String firstName;
        private String lastName;
        private String mobileNumber;


        public SignUpRequestBuilder buildUsername(String username) {
            this.username = username;
            return this;
        }

        public SignUpRequestBuilder buildPassword(String password) {
            this.password = password;
            return this;
        }

        public SignUpRequestBuilder buildEmail(String email) {
            this.email = email;
            return this;
        }

        public SignUpRequestBuilder buildFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public SignUpRequestBuilder buildLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public SignUpRequestBuilder buildMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public SignUpRequest build() {
            return new SignUpRequest(this);
        }


    }
}
