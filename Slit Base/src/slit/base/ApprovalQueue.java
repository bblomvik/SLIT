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
public class ApprovalQueue {
    private ArrayList<Student> students;

    public ApprovalQueue(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void AddStudent(Student student) {
        this.students.add(student);
    }
    
    public void RemoveStudent(Student student) {
        this.students.remove(student);
    }
    
}
