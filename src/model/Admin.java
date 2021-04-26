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
public class Admin extends User {
    
    public Admin() {
        super();
    }
    
    public Admin(String username, String password, String name, String surname, String address, String email, Date birthdate) {
        super(username, password, name, surname, address, email, birthdate);
    }
    
}
