package com.mery.votingsystem.coreclasses;

import java.util.ArrayList;

public class MukhtarElection extends Election {

    @Override
    public void findWinner() {
        electionWinner.removeAll(electionWinner);
        for (City city : MSK.cities) {
            for (String neighbourhood : city.neighbourhoods) {
                int winnerVotes = 0;
                Candidate winner = null;
                for (Candidate candidate : candidates) {
                    if (candidate.city.equals(city) && candidate.neighbourhood.equals(neighbourhood)) {
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
}
