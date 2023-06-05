package com.mery.votingsystem.coreclasses;


public class Person {

    private String userName;
    private String FirstName;
    private String Surname;
    private String password;

    public Person(String userName, String FirstName, String Surname, String password) {
        this.userName = userName;
        this.FirstName = FirstName;
        this.Surname = Surname;
        this.password = password;
    }

    
    
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

    @Override
    public String toString() {
        return FirstName+" "+Surname;
    }
    
    

}
