/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.base;

import java.util.ArrayList;

/**
 *
 * @author Mathias
 */
public class Student extends User {
    private int studentID;
    private ArrayList<Deliverable> deliverables;
    
    public Student(String userId, String fname, String lname, String em, int phoneNumber, int studentID, ArrayList<Deliverable> deliverables) {
        
        super(userId, fname, lname, em, phoneNumber);
        this.studentID = studentID;
        this.deliverables = deliverables;
    }

    public int getStudentID() {
        return studentID;
    }

    public ArrayList<Deliverable> deliverable() {
        return deliverables;
    }
    
    /**
     * 
     * Proposed way of searching for a students module based on deliverables!
     * Filters(loops) through the students list of Deliverables and returns the appropriate one based on the name of the module searched for.
     * 
     * @param name - The name of the module you are searching for.
     * 
     * @return 
     * The Deliverable class with the matching module name.
     */
    public Deliverable getDeliverableforModuleName(String name) {
        for (int i = 0; i < deliverables.size(); i++) {
            Deliverable d = deliverables.get(i);
            String t = d.getModule().getModuleName();
            if (t.equals(name)) {
                return d;
            }
        }
        
        System.err.println("Student.GetDeliverableforModuleName: Cannot find any module with specified name!");
        return null;
    }
    
    
    public void requestApproval() {
        
    }
    
}
