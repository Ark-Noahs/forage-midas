//this line tells us us that this file is part of thr 'entity' folder 
package com.jpmc.midascore.entity;

import jakarta.persistence.*;//imporrts tools to help java work w/ database 

@Entity//mark this class to be saved in the database 
public class UserRecord {

    @Id//this is the unique identifier(primary key)
    @GeneratedValue()//generates an id 
    private long id;

    @Column(nullable = false)//stores user name which CANT be null
    private String name;

    @Column(nullable = false)//stores users balance which CANT be null 
    private float balance;

    //constuctor that is needed to make a blank object to then be filled w/ details from the database 
    protected UserRecord() {  
    }
    //this method makes a new user 
    public UserRecord(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override// this changes the object to a string 
    public String toString() {
        return String.format("User[id=%d, name='%s', balance='%f'", id, name, balance);
    }

    //gets you the users ID
    public Long getId() {
        return id;
    }

    //gets you the users name
    public String getName() {
        return name;
    }

    //gets you the users balance 
    public float getBalance() {
        return balance;
    }

    //lets you modify the users balance 
    public void setBalance(float balance) {
        this.balance = balance;
    }

}
