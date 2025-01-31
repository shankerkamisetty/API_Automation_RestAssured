package com.api.model.request;

public class SignUpRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String mobileNumber;
    private String email;
    private String username;

    public SignUpRequest(String username, String password, String email, String firstName, String lastName, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
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


        public SignUpRequestBuilder getSetUsername(String username) {
            this.username = username;
            return this;
        }

        public SignUpRequestBuilder getSetPassword(String password) {
            this.password = password;
            return this;
        }

        public SignUpRequestBuilder getSetEmail(String email) {
            this.email = email;
            return this;
        }

        public SignUpRequestBuilder getSetFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public SignUpRequestBuilder getSetLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public SignUpRequestBuilder getSetMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public SignUpRequest build() {
            return new SignUpRequest(username, password, email
                    , firstName, lastName, mobileNumber);
        }


    }
}
