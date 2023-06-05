package com.mery.votingsystem.jpa;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author merye
 */
public class Test {

    public static void main(String[] args) {
        //addAdmin();
        //addCandidate();
        //addUser();
        //addElection();
        //addVote();
        //removeElection();
        //removeCandidatetoElection();
    }

    public static void addAdmin() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MSK");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Admin admin = new Admin("adminx", "123", "admin", "admin", 30, 1);
        em.persist(admin);
        em.getTransaction().commit();
    }

    public static void addUser() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MSK");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        User user1 = new User("user1", "123", "user1", "user1", 21, 1);
        User user2 = new User("user2", "123", "user2", "user2", 20, 1);
        em.persist(user1);
        em.persist(user2);
        em.getTransaction().commit();
    }

    public static void addCandidate() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MSK");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Candidate candidate1 = new Candidate("candidate1", "123", "candidate1", "candidate1", 20, 1);
        Candidate candidate2 = new Candidate("candidate2", "123", "candidate2", "candidate2", 21, 1);

        em.persist(candidate1);
        em.persist(candidate2);
        em.getTransaction().commit();
    }

    public static void addElection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MSK");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Candidate candidate1 = em.find(Candidate.class, 351);
        Candidate candidate2 = em.find(Candidate.class, 352);

        MukhtarElection mukhtarElection1 = new MukhtarElection();
        ElectionCandidates electionCandidate1 = new ElectionCandidates(mukhtarElection1, candidate1);
        ElectionCandidates electionCandidate2 = new ElectionCandidates(mukhtarElection1, candidate2);

        ArrayList<ElectionCandidates> electionCandidates = new ArrayList<>();
        electionCandidates.add(electionCandidate2);
        electionCandidates.add(electionCandidate1);
        mukhtarElection1.setElectionCandidatesList(electionCandidates);
        em.persist(mukhtarElection1);
        em.persist(electionCandidate1);
        em.persist(electionCandidate2);
        em.getTransaction().commit();
    }

    public static void addVote() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MSK");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        User user1 = em.find(User.class, 353);
        MukhtarElection mukhtarElection = em.find(MukhtarElection.class, 501);
        Vote vote= new Vote(mukhtarElection, mukhtarElection.getElectionCandidatesList().get(0).getCandidateId(), user1);
        
        em.persist(vote);
        em.getTransaction().commit();

    }
    
    public static void removeElection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MSK");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        MukhtarElection mukhtarElection = em.find(MukhtarElection.class, 501);
//        Candidate candidate1 = em.find(Candidate.class, 351);
//        Candidate candidate2 = em.find(Candidate.class, 352);
        
        em.remove(mukhtarElection);
        em.getTransaction().commit();
    }
    
    public static void removeCandidatetoElection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MSK");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        MukhtarElection mukhtarElection = em.find(MukhtarElection.class, 651);
        
        em.remove(mukhtarElection.getElectionCandidatesList().get(0));
        em.getTransaction().commit();
        
    }
}
//OVERLOAD03062023
