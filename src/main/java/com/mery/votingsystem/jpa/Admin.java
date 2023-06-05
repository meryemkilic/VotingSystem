package com.mery.votingsystem.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author merye
 */

@Entity
@DiscriminatorValue("Admin")
public class Admin extends People {

    public Admin() {
    }
     public Admin(String username, String password, String firstName, String surname, Integer age, Integer region) {
        super(username, password, firstName, surname, age, region);
    }
}
