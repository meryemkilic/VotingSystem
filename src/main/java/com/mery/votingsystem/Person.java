package com.mery.votingsystem;


public class Person {

    private String userName;
    private String FirstName;
    private String Surname;
    private String password;

    String getUserName() {
        return userName;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    String getFirstName() {
        return FirstName;
    }

    void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    String getSurname() {
        return Surname;
    }

    void setSurname(String Surname) {
        this.Surname = Surname;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }

}
