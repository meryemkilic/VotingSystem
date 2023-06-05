/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mery.votingsystem.jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author merye
 */
@Entity
@Table(name = "ELECTIONS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ELECTION_TYPE")
@NamedQueries({
    @NamedQuery(name = "Elections.findAll", query = "SELECT e FROM Elections e"),
    @NamedQuery(name = "Elections.findByElectionId", query = "SELECT e FROM Elections e WHERE e.electionId = :electionId"),
    @NamedQuery(name = "Elections.findByElectionType", query = "SELECT e FROM Elections e WHERE e.electionType = :electionType")})
public class Elections implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ELECTION_ID")
    @GeneratedValue
    private Integer electionId;
    @Column(name = "ELECTION_TYPE")
    private String electionType;
    @OneToMany(mappedBy = "electionId",cascade = CascadeType.ALL)
    private List<ElectionCandidates> electionCandidatesList;
    @OneToMany(mappedBy = "electionId",cascade = CascadeType.REMOVE)
    private List<Vote> voteList;

    public Elections() {
    }

    public Elections(Integer electionId) {
        this.electionId = electionId;
    }

    public Integer getElectionId() {
        return electionId;
    }

    public void setElectionId(Integer electionId) {
        this.electionId = electionId;
    }

    public String getElectionType() {
        return electionType;
    }

    public void setElectionType(String electionType) {
        this.electionType = electionType;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (electionId != null ? electionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elections)) {
            return false;
        }
        Elections other = (Elections) object;
        if ((this.electionId == null && other.electionId != null) || (this.electionId != null && !this.electionId.equals(other.electionId))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "electionID: " + electionId + " election type: " + electionType;
    }

}
