package com.mery.votingsystem.jpa;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author merye
 */
@Entity
@DiscriminatorValue("Candidate")

public class Candidate extends People {

    @OneToMany(mappedBy = "candidateId")
    private List<ElectionCandidates> electionCandidatesList;
    @OneToMany(mappedBy = "candidateId")
    private List<Vote> voteList;

    public Candidate() {
    }

    public Candidate(String username, String password, String firstName, String surname, Integer age, Integer region) {
        super(username, password, firstName, surname, age, region);
    }

    public List<ElectionCandidates> getElectionCandidatesList() {
        return electionCandidatesList;
    }

    public void setElectionCandidatesList(List<ElectionCandidates> electionCandidatesList) {
        this.electionCandidatesList = electionCandidatesList;
    }

    public List<Vote> getVoteList() {
        return voteList;
    }

    public void setVoteList(List<Vote> voteList) {
        this.voteList = voteList;
    }

}
