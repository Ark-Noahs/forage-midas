//this file is in foundation folder 
package com.jpmc.midascore.foundation;

//lets us use special annatation that tells Jackson to ignore extra fields it may encounter ("@JsonIgnoreProperties")
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//this needs to be above the class to help ignore extra fields that may cause errors or crashes present in a class
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

    private long senderId;   //ID of person SENDING $
    private long recipientId;//ID of person GETTING $
    private float amount;   // $ being sent

    //empty consrtuctor needed to create transaction object 
    public Transaction() {
    }

    //constructor we use to create new transaction w/ needed details
    public Transaction(long senderId, long recipientId, float amount) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
    }

    //GETs the senders ID
    public long getSenderId() {
        return senderId;
    }

    //SETS(modify) the senders ID
    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    //GET recievers ID
    public long getRecipientId() {
        return recipientId;
    }

    //SETS(modify) the recievers ID
    public void setRecipientId(long recipientId) {
        this.recipientId = recipientId;
    }

    //GETS the amount of $ for the transaction
    public float getAmount() {
        return amount;
    }

    //SETS(modify) amount of $ for transaction
    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override//prints out transaction details for debugging
    public String toString() {
        return "Transaction {senderId=" + senderId + ", recipientId=" + recipientId + ", amount=" + amount + "}";
    }
}
