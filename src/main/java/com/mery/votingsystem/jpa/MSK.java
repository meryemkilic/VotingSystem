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

    public static List<Neighbourhood> getNeighbyCity(String city) {
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

//    public static List<MukhtarElection> listMukhtarCandidate(){
//        return;
//    }
    public static Neighbourhood getNeighbyId(int id) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        Neighbourhood neigh = em.createNamedQuery("Neighbourhood.findByNeighId", Neighbourhood.class).setParameter("neighId", id).getSingleResult();

        em.close();
        emf.close();

        return neigh;
    }

    public static boolean isVotedMukhtar(User user) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        Vote vote = null;

        try {
            vote = em.createQuery("SELECT v FROM Vote v WHERE v.userId.id=:userId AND v.electionId.electionType= 'Mukhtar'",
                    Vote.class).setParameter("userId", user.getId()).getSingleResult();

        } catch (Exception e) {
            return true;
        }
        em.close();
        emf.close();

        if (vote == null) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Candidate> listMukhtarCandidatesbyRegion(Neighbourhood region) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        //List<Candidate> candidates= em.createQuery("SELECT v FROM Candidate ", type)
        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType= 'Mukhtar'", Elections.class).getSingleResult();
        List<Candidate> candidates = new ArrayList<>();
        for (ElectionCandidates electionCandidate : election.getElectionCandidatesList()) {
            if (electionCandidate.getCandidateId().getRegion() == region.getNeighId()) {
                candidates.add(electionCandidate.getCandidateId());
            }
        }
        em.close();
        emf.close();
        return candidates;
    }

    public static void addVote(Vote vote, String electionType) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        em.getTransaction().begin();

        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType =:electionType",
                Elections.class).setParameter("electionType", electionType).getSingleResult();
        vote.setElectionId(election);
        election.getVoteList().add(vote);
        em.persist(vote);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static List<Candidate> listMunicipalCandidatesbyRegion(Neighbourhood region) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        //List<Candidate> candidates= em.createQuery("SELECT v FROM Candidate ", type)
        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType= 'Municipal'",
                Elections.class).getSingleResult();
        List<Candidate> candidates = new ArrayList<>();
        for (ElectionCandidates electionCandidate : election.getElectionCandidatesList()) {
            if (electionCandidate.getCandidateId().getRegion() == region.getNeighId()) {
                candidates.add(electionCandidate.getCandidateId());
            }
        }
        em.close();
        emf.close();
        return candidates;
    }

    public static Elections getElections(String electionType) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType=:electionType",
                Elections.class).setParameter("electionType", electionType).getSingleResult();

        em.close();
        emf.close();
        return election;
    }

    public static boolean isVotedMunicipal(User user) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        Vote vote = null;

        try {
            vote = em.createQuery("SELECT v FROM Vote v WHERE v.userId.id=:userId AND v.electionId.electionType= 'Municipal'",
                    Vote.class).setParameter("userId", user.getId()).getSingleResult();

        } catch (Exception e) {
            return true;
        }
        em.close();
        emf.close();

        if (vote == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVotedPresidential(User user) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        Vote vote = null;

        try {
            vote = em.createQuery("SELECT v FROM Vote v WHERE v.userId.id=:userId AND v.electionId.electionType= 'Presidential'",
                    Vote.class).setParameter("userId", user.getId()).getSingleResult();

        } catch (Exception e) {
            return true;
        }
        em.close();
        emf.close();

        if (vote == null) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Elections> getElections() {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        List<Elections> elections = em.createNamedQuery("Elections.findAll", Elections.class).getResultList();

        em.close();
        emf.close();
        return elections;

    }

    public static Integer getVotesCount(ElectionCandidates electionCandidates) {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();

        List<Vote> votes = em.createQuery("SELECT v FROM Vote v WHERE v.candidateId=:candidateId", Vote.class).getResultList();

        em.close();
        emf.close();
        return votes.size();
    }

    public static void findWinner() {
        emf = Persistence.createEntityManagerFactory("MSK");
        em = emf.createEntityManager();
        em.getTransaction().begin();

        for (Elections election : getElections()) {
            if (election instanceof PresidentialElection) {
                int winnerVotes = 0;
                ElectionCandidates Winner = null;
                for (ElectionCandidates electionCandidates : election.getElectionCandidatesList()) {
                    if (electionCandidates.getCandidateId().getVoteList().size() > winnerVotes) {
                        winnerVotes = electionCandidates.getCandidateId().getVoteList().size();
                        Winner = electionCandidates;
                    }
                }
                Winner.setWinner(true);
                em.persist(Winner);

            } else if (election instanceof MunicipalElection) {
                for (String city : getCities()) {
                    int winnerVotes = 0;
                    ElectionCandidates Winner = null;
                    for (ElectionCandidates electionCandidates : election.getElectionCandidatesList()) {
                        Neighbourhood neighbourhood = getNeighbyId(electionCandidates.getCandidateId().getRegion());
                        if (neighbourhood.getCity().equals(city)) {
                            if (electionCandidates.getCandidateId().getVoteList().size() > winnerVotes) {
                                winnerVotes = electionCandidates.getCandidateId().getVoteList().size();
                                Winner = electionCandidates;
                            }
                        }
                    }
                    Winner.setWinner(true);
                    em.persist(Winner);
                }

            } else if (election instanceof MukhtarElection) {
                List<Neighbourhood> neighbourhoods = em.createNamedQuery("Neighbourhood.findAll", Neighbourhood.class).getResultList();
                for (Neighbourhood neighbourhood : neighbourhoods) {
                    int winnerVotes = 0;
                    ElectionCandidates Winner = null;
                    for (ElectionCandidates electionCandidates : election.getElectionCandidatesList()) {
                        if (electionCandidates.getCandidateId().getRegion() == neighbourhood.getNeighId()) {
                            if (electionCandidates.getCandidateId().getVoteList().size() > winnerVotes) {
                                winnerVotes = electionCandidates.getCandidateId().getVoteList().size();
                                Winner = electionCandidates;
                            }
                        }
                    }
                    Winner.setWinner(true);
                    em.persist(Winner);
                }
            }
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
