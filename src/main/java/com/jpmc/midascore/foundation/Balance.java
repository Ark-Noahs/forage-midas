//line below tells us that this file is part of the 'foundation' folder 
package com.jpmc.midascore.foundation;

//this line is tool from jackson library that lets us use "@JsonIgnoreProperties"
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//this line is needed above the class to act as an annotation, so if it sees any extra stuff that isnt in the class it should ignore it
//to prevent crashes or compile errors
@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance {
    private float amount;// var to store the amount of money in account

    //empty constructor that creates a?????????????????
    public Balance() {
    }

    //constructor that we can use to make a balance object w/ specific ammount
    public Balance(float amount) {
        this.amount = amount;
    }

    //gets us the value of amount
    public float getAmount() {
        return amount;
    }

    //lets us change the amount 
    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override//used for debugging to print out the balance
    public String toString() {
        return "Balance {amount=" + amount + "}";
    }
}