/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mery.votingsystem.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author merye
 */
@Entity
@DiscriminatorValue("Presidential")
public class PresidentialElection extends Elections{

    public PresidentialElection() {
    }
    
}
