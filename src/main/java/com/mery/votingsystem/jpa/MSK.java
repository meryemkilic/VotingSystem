/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mery.votingsystem.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author merye
 */
public class MSK {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static People login(String username, String password) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        Query query = em.createQuery("SELECT p FROM People p WHERE p.username=:username AND p.password=:password", People.class);

        query.setParameter("username", username);
        query.setParameter("password", password);
        People person = (People) query.getSingleResult();

        em.close();
        emf.close();

        return person;
    }

    public static ArrayList<String> getCities() {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        ArrayList<String> cities = new ArrayList<>();
        List<Neighbourhood> neighbourhoods = em.createNamedQuery("Neighbourhood.findAll", Neighbourhood.class).getResultList();
        for (Neighbourhood neighbourhood : neighbourhoods) {
            if (!cities.contains(neighbourhood.getCity())) {
                cities.add(neighbourhood.getCity());
            }
        }
        em.close();
        emf.close();
        return cities;

    }

    public static List<Neighbourhood> getNeigh(String city) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        List<Neighbourhood> neighbourhoods = em.createNamedQuery("Neighbourhood.findByCity", Neighbourhood.class).setParameter("city", city).getResultList();

        em.close();
        emf.close();
        return neighbourhoods;
    }

    public static void addPeople(People person) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    public static boolean checkUsername(String username) {

        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        Query query = em.createQuery("SELECT COUNT(u) FROM People u WHERE u.username = :username");
        query.setParameter("username", username);
        Long count = (Long) query.getSingleResult();

        em.close();
        emf.close();
        return count != 0;
    }

    public static List<Candidate> getCandidates() {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        List<Candidate> resultList = em.createNamedQuery("People.findAllCandidates", Candidate.class).getResultList();
        em.close();
        emf.close();
        return resultList;
    }

    public static void removeElections() {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Elections> electionsList = em.createNamedQuery("Elections.findAll", Elections.class).getResultList();
        for (Elections elections : electionsList) {
            em.remove(elections);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static void createElections(Elections... elections) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        em.getTransaction().begin();

        for (Elections election : elections) {
            em.persist(election);
        }
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    public static List<MukhtarElection> listMukhtarCandidate(){
        
    }
}
