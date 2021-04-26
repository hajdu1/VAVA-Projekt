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
public class Employee extends User {
    
    private String position;
    
    public Employee() {
        super();
    }
    
    public Employee(String username, String password, String name, String surname, String address, String email, Date birthdate, String position) {
        super(username, password, name, surname, address, email, birthdate);
        this.position = position;
    }

    @Override
    public String toString() {
        return this.getSurname() + " " + this.getName() + " (" + position + ")";
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
