package com.api.model.request;

public class LoginRequest {

    private String username;
    private String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class LoginRequestBuilder {

        private String username;
        private String password;

        public LoginRequestBuilder buildUsername(String username) {
            this.username = username;
            return this;
        }

        public LoginRequestBuilder buildPassword(String password) {
            this.password = password;
            return this;
        }

        public LoginRequest build() {
            return new LoginRequest(username, password);
        }
    }
}
