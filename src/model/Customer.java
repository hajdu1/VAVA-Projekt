/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Jakub
 */
public class Customer extends User {
    
    private Account account;
    
    public Customer() {
        super();
    }
    
    public Customer(String username, String password, String name, String surname, String address, String email, Date birthdate, Account account) {
        super(username, password, name, surname, address, email, birthdate);
        this.account = account;
    }

    @Override
    public String toString() {
        return this.getSurname() + " " + this.getName() + " (" + account.getIban() + ")";
    }
    
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
