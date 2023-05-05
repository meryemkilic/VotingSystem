package com.mery.votingsystem;

public class PresidentialElection extends Election {

    @Override
    public void findWinner() {
        electionWinner.removeAll(electionWinner);
        int winnerVotes = 0;
        Candidate winner = null;
        for (Candidate candidate : candidates) {
            int currentVote = voteCalculator(candidate);
            if (winnerVotes < currentVote) {
                winnerVotes = currentVote;
                winner = candidate;
            }
        }
        electionWinner.add(winner);
    }
}
