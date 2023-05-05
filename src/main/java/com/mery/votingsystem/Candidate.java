
package com.mery.votingsystem;

import java.util.ArrayList;


public class Candidate extends Person{
    
    CV cv;
    int age;
    City city;
    String neighbourhood;
    
    

    public Candidate(int age, City city, String neighbourhood, String userName, String FirstName, String Surname, String password) {
        super(userName, FirstName, Surname, password);
        this.age = age;
        this.city = city;
        this.neighbourhood = neighbourhood;
    }
    
    public boolean status(){
        for (Election election : MSK.elections) {
            if(election.candidates.contains(this)&&election.electionWinner.contains(this)){
                return true;
            }            
        }
    return false;
    }
}
