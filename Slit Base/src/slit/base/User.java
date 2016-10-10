/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.base;

/**
 *
 * @author Mathias
 */
public class User {
    private String User_ID;
    private String firstName;
    private String lastName;
    private String email;
    private int phonenumber;
    
    /*
    TODO: Notification is added in the class diagram. Should this be a class?
    */
 
    
    /*
        Constructor for the class User.
    */
    public User(String userId, String fname, String lname, String em, int phoneNumber) {
    
        this.User_ID = userId;
        this.firstName = fname;
        this.lastName = lname;
        this.email = em;
        this.phonenumber = phoneNumber;

    }
    
    
    public String getFirstName() {
        return this.firstName;
    }

    public String getUser_ID() {
        return User_ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }
 
}
