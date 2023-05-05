/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mery.votingsystem;

import java.util.ArrayList;

/**
 *
 * @author merye
 */
public class City {
    
    String cityName;
    public ArrayList<String> neighbourhoods = new ArrayList<>();

    public City(String cityName) {
        this.cityName = cityName;
    }

    
    @Override
    public String toString() {
        return cityName; 
    }
    
    
}
