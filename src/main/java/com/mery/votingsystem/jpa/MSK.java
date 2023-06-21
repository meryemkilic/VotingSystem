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

    public static void InitEntitiyManagers() {

        if (emf == null || em == null) {
            emf = Persistence.createEntityManagerFactory("MSK");
            em = emf.createEntityManager();
        }
    }

    public static People login(String username, String password) {

        Query query = em.createQuery("SELECT p FROM People p WHERE p.username=:username AND p.password=:password", People.class);

        query.setParameter("username", username);
        query.setParameter("password", password);
        People person = (People) query.getSingleResult();

        return person;
    }

    public static ArrayList<String> getCities() {

        ArrayList<String> cities = new ArrayList<>();
        List<Neighbourhood> neighbourhoods = em.createNamedQuery("Neighbourhood.findAll", Neighbourhood.class).getResultList();
        for (Neighbourhood neighbourhood : neighbourhoods) {
            if (!cities.contains(neighbourhood.getCity())) {
                cities.add(neighbourhood.getCity());
            }
        }

        return cities;

    }

    public static List<Neighbourhood> getNeighbyCity(String city) {

        List<Neighbourhood> neighbourhoods = em.createNamedQuery("Neighbourhood.findByCity", Neighbourhood.class).setParameter("city", city).getResultList();

        return neighbourhoods;
    }

    public static void addPeople(People person) {

        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();

    }

    public static boolean checkUsername(String username) {

        Query query = em.createQuery("SELECT COUNT(u) FROM People u WHERE u.username = :username");
        query.setParameter("username", username);
        Long count = (Long) query.getSingleResult();

        return count != 0;
    }

    public static List<Candidate> getCandidates() {

        List<Candidate> resultList = em.createNamedQuery("People.findAllCandidates", Candidate.class).getResultList();

        return resultList;
    }

    public static void removeElections() {

        em.getTransaction().begin();
        List<Elections> electionsList = em.createNamedQuery("Elections.findAll", Elections.class).getResultList();
        for (Elections elections : electionsList) {
            em.remove(elections);
        }
        em.getTransaction().commit();

    }

    public static void createElections(Elections... elections) {

        em.getTransaction().begin();

        for (Elections election : elections) {
            em.persist(election);
        }
        em.getTransaction().commit();

    }

//    public static List<MukhtarElection> listMukhtarCandidate(){
//        return;
//    }
    public static Neighbourhood getNeighbyId(int id) {

        Neighbourhood neigh = em.createNamedQuery("Neighbourhood.findByNeighId", Neighbourhood.class).setParameter("neighId", id).getSingleResult();

        return neigh;
    }

    public static boolean isVotedMukhtar(User user) {

        Vote vote = null;

        try {
            vote = em.createQuery("SELECT v FROM Vote v WHERE v.userId.id=:userId AND v.electionId.electionType= 'Mukhtar'",
                    Vote.class).setParameter("userId", user.getId()).getSingleResult();

        } catch (Exception e) {
            return true;
        }

        if (vote == null) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Candidate> listMukhtarCandidatesbyRegion(Neighbourhood region) {

        //List<Candidate> candidates= em.createQuery("SELECT v FROM Candidate ", type)
        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType= 'Mukhtar'", Elections.class).getSingleResult();
        List<Candidate> candidates = new ArrayList<>();
        for (ElectionCandidates electionCandidate : election.getElectionCandidatesList()) {
            if (electionCandidate.getCandidateId().getRegion() == region.getNeighId()) {
                candidates.add(electionCandidate.getCandidateId());
            }
        }

        return candidates;
    }

    public static List<ElectionCandidates> listMukhtarCandidatebyRegion(Neighbourhood region) {

        //List<Candidate> candidates= em.createQuery("SELECT v FROM Candidate ", type)
        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType= 'Mukhtar'", Elections.class).getSingleResult();
        List<ElectionCandidates> candidates = new ArrayList<>();
        for (ElectionCandidates electionCandidate : election.getElectionCandidatesList()) {
            if (electionCandidate.getCandidateId().getRegion() == region.getNeighId()) {
                candidates.add(electionCandidate);
            }
        }

        return candidates;
    }

    public static void addVote(Vote vote, String electionType) {

        em.getTransaction().begin();

        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType =:electionType",
                Elections.class).setParameter("electionType", electionType).getSingleResult();
        vote.setElectionId(election);
        election.getVoteList().add(vote);
        em.persist(vote);
        em.getTransaction().commit();

    }

    public static List<Candidate> listMunicipalCandidatesbyRegion(Neighbourhood region) {

        //List<Candidate> candidates= em.createQuery("SELECT v FROM Candidate ", type)
        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType= 'Municipal'",
                Elections.class).getSingleResult();
        List<Candidate> candidates = new ArrayList<>();
        for (ElectionCandidates electionCandidate : election.getElectionCandidatesList()) {
            if (electionCandidate.getCandidateId().getRegion() == region.getNeighId()) {
                candidates.add(electionCandidate.getCandidateId());
            }
        }

        return candidates;
    }

    public static List<ElectionCandidates> listMunicipalCandidatebyRegion(Neighbourhood region) {

        //List<Candidate> candidates= em.createQuery("SELECT v FROM Candidate ", type)
        Elections election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType= 'Municipal'",
                Elections.class).getSingleResult();
        List<ElectionCandidates> candidates = new ArrayList<>();
        for (ElectionCandidates electionCandidate : election.getElectionCandidatesList()) {
            if (electionCandidate.getCandidateId().getRegion() == region.getNeighId()) {
                candidates.add(electionCandidate);
            }
        }

        return candidates;
    }

    public static Elections getElections(String electionType) {
        Elections election = null;
        try {
            election = em.createQuery("SELECT e FROM Elections e WHERE e.electionType=:electionType",
                    Elections.class).setParameter("electionType", electionType).getSingleResult();
        } catch (Exception e) {
            System.out.println("hahahahah");
        }
        return election;
    }

    public static boolean isVotedMunicipal(User user) {

        Vote vote = null;

        try {
            vote = em.createQuery("SELECT v FROM Vote v WHERE v.userId.id=:userId AND v.electionId.electionType= 'Municipal'",
                    Vote.class).setParameter("userId", user.getId()).getSingleResult();

        } catch (Exception e) {
            return true;
        }

        if (vote == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVotedPresidential(User user) {

        Vote vote = null;

        try {
            vote = em.createQuery("SELECT v FROM Vote v WHERE v.userId.id=:userId AND v.electionId.electionType= 'Presidential'",
                    Vote.class).setParameter("userId", user.getId()).getSingleResult();

        } catch (Exception e) {
            return true;
        }

        if (vote == null) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Elections> getElections() {

        List<Elections> elections = em.createNamedQuery("Elections.findAll", Elections.class).getResultList();

        return elections;

    }

    public static Integer getVotesCount(ElectionCandidates electionCandidates) {

        List<Vote> votes = em.createQuery("SELECT v FROM Vote v WHERE v.candidateId=:candidateId", Vote.class).setParameter("candidateId", electionCandidates.getCandidateId()).getResultList();

        return votes.size();
    }

    public static void findWinner() {

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
                if (Winner != null) {
                    Winner.setWinner(true);
                    em.persist(Winner);
                }

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
                    if (Winner != null) {
                        Winner.setWinner(true);
                        em.persist(Winner);
                    }
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
                    if (Winner != null) {
                        Winner.setWinner(true);
                        em.persist(Winner);
                    }
                }
            }
        }
        em.getTransaction().commit();

    }

    public static void removeCandidates(Candidate candidate) {
        em.getTransaction().begin();
        Candidate candidates = em.find(Candidate.class,candidate.getId());
        for (Vote vote : candidate.getVoteList()) {
            em.remove(vote);
        }
        for (ElectionCandidates electionCandidates : candidate.getElectionCandidatesList()) {
            em.remove(electionCandidates);
        }
        em.remove(candidates);
        em.getTransaction().commit();
    }
}
