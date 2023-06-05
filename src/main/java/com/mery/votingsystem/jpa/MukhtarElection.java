package com.mery.votingsystem.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author merye
 */

@Entity
@DiscriminatorValue("Mukhtar")
public class MukhtarElection extends Elections{

    public MukhtarElection() {
    }
    
}
