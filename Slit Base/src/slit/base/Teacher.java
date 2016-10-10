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
public class Teacher extends User {
    private int teacherID;
    
    public Teacher(String userId, String fname, String lname, String em, int phoneNumber, int teacherID) {
        
        super(userId, fname, lname, em, phoneNumber);
        this.teacherID = teacherID;
    }
    
    public Feedback createFeedback(String comment, boolean approved) {
        
        Feedback f = new Feedback(this, comment, false);
        return f;
    }
    
}
