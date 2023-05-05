package com.mery.votingsystem;

import java.util.ArrayList;

public class MSK {

    public static ArrayList<Person> people = new ArrayList<>();
    public static ArrayList<Election> elections = new ArrayList<>();
    public static ArrayList<City> cities = new ArrayList<>();

    public static void testInit() {

        City city = new City("Haliç");
        City city2 = new City("Valide-i Atik");
        City city3 = new City("Topkapı");
        city.neighbourhoods.add("D Blok");
        city.neighbourhoods.add("C Blok");
        city2.neighbourhoods.add("A Blok");
        city3.neighbourhoods.add("B Blok");
        cities.add(city);
        cities.add(city2);
        cities.add(city3);

        Admin admin = new Admin("admin", "admin", "admin", "123");
        User user1 = new User(20, "123456789", city, "D Blok", "emirhan", "Emirhan", "Soylu", "123");
        User user2 = new User(20, "123456789", city, "C Blok", "meryem", "Meryem", "Kılıç", "123");
        Candidate candidate = new Candidate(47, city, "D Blok", "candidate", "Ali", "Nizam", "123");
        Candidate candidate2 = new Candidate(36, city, "C Blok", "candidate", "Samet", "Kaya", "123");
        Candidate candidate3 = new Candidate(28, city2, "A Blok", "candidate", "Zahid Esad", "Baltacı", "123");
        Candidate candidate4 = new Candidate(24, city3, "B Blok", "candidate", "Sare", "Bayram", "123");
        people.add(admin);
        people.add(user1);
        people.add(user2);
        people.add(candidate);
        people.add(candidate2);
        people.add(candidate3);
        people.add(candidate4);
    }

}
