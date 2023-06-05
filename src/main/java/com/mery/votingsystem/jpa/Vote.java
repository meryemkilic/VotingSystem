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
@Table(name = "VOTE")
@NamedQueries({
    @NamedQuery(name = "Vote.findAll", query = "SELECT v FROM Vote v"),
    @NamedQuery(name = "Vote.findById", query = "SELECT v FROM Vote v WHERE v.id = :id")})
public class Vote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    public Vote(Elections electionId, Candidate candidateId, User userId) {
        this.electionId = electionId;
        this.candidateId = candidateId;
        this.userId = userId;
    }
    @JoinColumn(name = "ELECTION_ID", referencedColumnName = "ELECTION_ID")
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Elections electionId;
    @JoinColumn(name = "CANDIDATE_ID", referencedColumnName = "ID")
    @ManyToOne
    private Candidate candidateId;
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    @ManyToOne
    private User userId;

    public Vote() {
    }

    public Vote(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Elections getElectionId() {
        return electionId;
    }

    public void setElectionId(Elections electionId) {
        this.electionId = electionId;
    }

    public People getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Candidate candidateId) {
        this.candidateId = candidateId;
    }

    public People getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
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
        if (!(object instanceof Vote)) {
            return false;
        }
        Vote other = (Vote) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Election: " + electionId.toString() + " Candidate: " + candidateId.toString() + " User: " + userId.toString();
    }

}
