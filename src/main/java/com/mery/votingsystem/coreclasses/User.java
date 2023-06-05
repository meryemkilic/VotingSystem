
package com.mery.votingsystem.coreclasses;


public class User extends Person {
    
    int age;
    String TC;
    City city;
    String neighbourhood;

    public User(int age, String TC, City city, String neighbourhood, String userName, String FirstName, String Surname, String password) {
        super(userName, FirstName, Surname, password);
        this.age = age;
        this.TC = TC;
        this.city = city;
        this.neighbourhood = neighbourhood;
    }
    

}
