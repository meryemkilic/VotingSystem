package com.mery.votingsystem.jpa;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author merye
 */
@Entity
@DiscriminatorValue("User")

public class User extends People {

    @OneToMany(mappedBy = "userId")
    private List<Vote> voteList1;

    public User() {
    }

    public User(String username, String password, String firstName, String surname, Integer age, Integer region) {
        super(username, password, firstName, surname, age, region);
    }

    public List<Vote> getVoteList1() {
        return voteList1;
    }

    public void setVoteList1(List<Vote> voteList1) {
        this.voteList1 = voteList1;
    }
}
