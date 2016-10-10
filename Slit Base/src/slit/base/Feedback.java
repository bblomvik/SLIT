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
public class Feedback {
    private Teacher teacher;
    private String comment;
    private boolean approved;

    public Feedback(Teacher teacher, String comment, boolean approved) {
        this.teacher = teacher;
        this.comment = comment;
        this.approved = approved;
    }
    
    public void EditComment(String newComment){
        this.comment = newComment;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getComment() {
        return comment;
    }

    public boolean isApproved() {
        return approved;
    }
    
    
}
