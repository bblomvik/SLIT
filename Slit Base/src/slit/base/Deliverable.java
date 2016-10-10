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
    private Feedback comment;
    private boolean approved;

    public Deliverable(Module module, String date, Feedback comment, boolean approved) {
        this.module = module;
        this.date = date;
        this.comment = comment;
        this.approved = approved;
    }

    public Module getModule() {
        return module;
    }

    public String getDate() {
        return date;
    }

    public Feedback getComment() {
        return comment;
    }

    public boolean isApproved() {
        return approved;
    }


    
}
