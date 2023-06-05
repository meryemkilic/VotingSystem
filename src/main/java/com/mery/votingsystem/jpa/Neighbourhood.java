/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mery.votingsystem.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author merye
 */
@Entity
@Table(name = "NEIGHBOURHOOD")
@NamedQueries({
    @NamedQuery(name = "Neighbourhood.findAll", query = "SELECT n FROM Neighbourhood n"),
    @NamedQuery(name = "Neighbourhood.findByNeighId", query = "SELECT n FROM Neighbourhood n WHERE n.neighId = :neighId"),
    @NamedQuery(name = "Neighbourhood.findByCity", query = "SELECT n FROM Neighbourhood n WHERE n.city = :city"),
    @NamedQuery(name = "Neighbourhood.findByNeigh", query = "SELECT n FROM Neighbourhood n WHERE n.neigh = :neigh")})
public class Neighbourhood implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NEIGH_ID")
    private Integer neighId;
    @Column(name = "CITY")
    private String city;
    @Column(name = "NEIGH")
    private String neigh;

    public Neighbourhood() {
    }

    public Neighbourhood(Integer neighId) {
        this.neighId = neighId;
    }

    public Integer getNeighId() {
        return neighId;
    }

    public void setNeighId(Integer neighId) {
        this.neighId = neighId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeigh() {
        return neigh;
    }

    public void setNeigh(String neigh) {
        this.neigh = neigh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (neighId != null ? neighId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Neighbourhood)) {
            return false;
        }
        Neighbourhood other = (Neighbourhood) object;
        if ((this.neighId == null && other.neighId != null) || (this.neighId != null && !this.neighId.equals(other.neighId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return neigh;
    }

}
