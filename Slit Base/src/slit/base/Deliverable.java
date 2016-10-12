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
public class Deliverable {
    private Module module;
    private String date;
    private Feedback feedback;
    private boolean approved;

    public Deliverable(Module module, String date, Feedback feedback) {
        this.module = module;
        this.date = date;
        this.feedback = feedback;
        this.approved = feedback.isApproved();
    }

    public Module getModule() {
        return module;
    }

    public String getDate() {
        return date;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * 
     * @return - The state of approval for this deliverable. This state is directly linked to the approval set through Feedback.
     */
    public boolean isApproved() {
        approved = feedback.isApproved();
        return approved;
    }


    
}
