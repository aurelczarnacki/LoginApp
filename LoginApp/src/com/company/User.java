package com.company;

public class User {
    User(String username, String password){
        this.username = username;
        this.password = password;
        this.secret = "---";
    }
    User(String username, String password, String secret){
        this.username = username;
        this.password = password;
        this.secret = secret;
    }

    private String password;
    private String username;
    private String secret;

    public boolean authenticate(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        else return false;
    }

    public boolean authenticate(String secret){
        if(this.secret.equals(secret) && this.secret != "---"){
            return true;
        }
        else return false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
