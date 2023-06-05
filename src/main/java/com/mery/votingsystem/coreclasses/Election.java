package com.mery.votingsystem.coreclasses;

import java.util.ArrayList;

public abstract class Election {

    ArrayList<Vote> votes = new ArrayList<>();
    ArrayList<Candidate> candidates = new ArrayList<>();
    ArrayList<Candidate> electionWinner = new ArrayList<>();


    public int voteCalculator(Candidate candidate) {
        int voteCount = 0;
        if (this.candidates.contains(candidate)) {
            for (Vote vote : this.votes) {
                if (vote.candidate.equals(candidate)) {
                    voteCount++;
                }
            }
        } else {
            return -1;
        }
        return voteCount;
    }
    public abstract void findWinner();

}
