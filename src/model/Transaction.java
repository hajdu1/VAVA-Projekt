/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jakub
 */
public abstract class Transaction {
    
    private Account initiatorAccount;
    private BigDecimal amount;
    private Date timestamp;
    
    public Transaction() {
        
    }

    public Transaction(Account initiatorAccount, BigDecimal amount, Date timestamp) {
        this.initiatorAccount = initiatorAccount;
        this.amount = amount.setScale(2, RoundingMode.HALF_UP);
        this.timestamp = timestamp;
    }
    
    public String getStringTimestamp() {
        DateFormat custom = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return custom.format(this.timestamp);
    } 
   
    public Account getInitiatorAccount() {
        return initiatorAccount;
    }

    public void setInitiatorAccount(Account initiatorAccount) {
        this.initiatorAccount = initiatorAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
}
