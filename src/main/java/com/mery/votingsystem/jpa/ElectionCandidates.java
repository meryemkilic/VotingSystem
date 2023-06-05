/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mery.votingsystem.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author merye
 */
@Entity
@Table(name = "ELECTION_CANDIDATES")
@NamedQueries({
    @NamedQuery(name = "ElectionCandidates.findAll", query = "SELECT e FROM ElectionCandidates e"),
    @NamedQuery(name = "ElectionCandidates.findById", query = "SELECT e FROM ElectionCandidates e WHERE e.id = :id"),
    @NamedQuery(name = "ElectionCandidates.findByWinner", query = "SELECT e FROM ElectionCandidates e WHERE e.winner = :winner")})
public class ElectionCandidates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    @Column(name = "WINNER")
    private Boolean winner;
    @JoinColumn(name = "ELECTION_ID", referencedColumnName = "ELECTION_ID")
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Elections electionId;
    @JoinColumn(name = "CANDIDATE_ID", referencedColumnName = "ID")
    @ManyToOne
    private Candidate candidateId;

    public ElectionCandidates() {
    }

    public ElectionCandidates(Elections electionId, Candidate candidateId) {
        this.electionId = electionId;
        this.candidateId = candidateId;
        this.winner=false;
    }

    public ElectionCandidates(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getWinner() {
        return winner;
    }

    public void setWinner(Boolean winner) {
        this.winner = winner;
    }

    public Elections getElectionId() {
        return electionId;
    }

    public void setElectionId(Elections electionId) {
        this.electionId = electionId;
    }

    public Candidate getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Candidate candidateId) {
        this.candidateId = candidateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElectionCandidates)) {
            return false;
        }
        ElectionCandidates other = (ElectionCandidates) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "election: " + electionId.toString() + " candidate: " + candidateId.toString();
    }

}
