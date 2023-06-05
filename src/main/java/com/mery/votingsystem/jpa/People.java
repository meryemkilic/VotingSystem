/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mery.votingsystem.jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "PEOPLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@NamedQueries({
    @NamedQuery(name = "People.findAll", query = "SELECT p FROM People p"),
    @NamedQuery(name = "People.findById", query = "SELECT p FROM People p WHERE p.id = :id"),
    @NamedQuery(name = "People.findByUsername", query = "SELECT p FROM People p WHERE p.username = :username"),
    @NamedQuery(name = "People.findByPassword", query = "SELECT p FROM People p WHERE p.password = :password"),
    @NamedQuery(name = "People.findByFirstName", query = "SELECT p FROM People p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "People.findBySurname", query = "SELECT p FROM People p WHERE p.surname = :surname"),
    @NamedQuery(name = "People.findByAge", query = "SELECT p FROM People p WHERE p.age = :age"),
    @NamedQuery(name = "People.findAllUsers", query = "SELECT p FROM People p WHERE p.type = 'User'"),
    @NamedQuery(name = "People.findAllCandidates", query = "SELECT p FROM People p WHERE p.type = 'Candidate'"),
    @NamedQuery(name = "People.findAllAdmins", query = "SELECT p FROM People p WHERE p.type = 'Admin'"),
    @NamedQuery(name = "People.findByType", query = "SELECT p FROM People p WHERE p.type = :type"),
    @NamedQuery(name = "People.findByRegion", query = "SELECT p FROM People p WHERE p.region = :region")})

public class People implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "REGION")
    private Integer region;

    public People() {
    }

    public People(Integer id) {
        this.id = id;
    }

    public People(Integer id, String firstName, String surname) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
    }

    public People(String username, String password, String firstName, String surname, Integer age, Integer region) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.region = region;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
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
        if (!(object instanceof People)) {
            return false;
        }
        People other = (People) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName + " " + surname;
    }

}
