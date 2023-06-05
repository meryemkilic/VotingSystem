package com.mery.votingsystem.coreclasses;

import java.util.ArrayList;

public class MunicipalElection extends Election {


    @Override
    public void findWinner() {
        electionWinner.removeAll(electionWinner);
        for (City city : MSK.cities) {
            int winnerVotes = 0;
            Candidate winner = null;
            for (Candidate candidate : candidates) {
                if (candidate.city.equals(city)) {
                    int currentVote = voteCalculator(candidate);
                    if (winnerVotes < currentVote) {
                        winnerVotes = currentVote;
                        winner = candidate;
                    }
                }
            }
            electionWinner.add(winner);
        }
    }
}
