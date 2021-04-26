/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Jakub
 */
public class Withdrawal extends Transaction {
    
    public Withdrawal() {
        super();
    }
    
    public Withdrawal(Account initiatorAccount, BigDecimal amount, Date timestamp) {
        super(initiatorAccount, amount, timestamp);
    }

    @Override
    public String toString() {
        return "[" + this.getStringTimestamp() + "] -" + this.getAmount().toString() + " (" + this.getInitiatorAccount().getIban() + ")";
    }
    
}
