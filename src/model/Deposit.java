/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.Date;
import view.MainFrame;

/**
 *
 * @author Jakub
 */
public class Deposit extends Transaction {
    
    private boolean confirmed;
    
    public Deposit() {
        super();
    }
    
    public Deposit(Account initiatorAccount, BigDecimal amount, Date timestamp) {
        super(initiatorAccount, amount, timestamp);
        this.confirmed = false;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        java.util.ResourceBundle bundle = MainFrame.getCurrentBundle();
        if (this.confirmed) {
            return "[" + this.getStringTimestamp() + "] +" + this.getAmount().toString() + " (" + this.getInitiatorAccount().getIban() + ")";
        } else {
            return "(" + bundle.getString("NEPOTVRDENÉ") + ") [" + this.getStringTimestamp() + "] +" + this.getAmount().toString() + " (" + this.getInitiatorAccount().getIban() + ")";
        }
    }
    
}
