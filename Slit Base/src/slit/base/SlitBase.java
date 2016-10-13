/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.base;

import Utilities.Utils.Utilities;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Mathias
 */
public class SlitBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            THIS IS ALL TESTING STUFF!
        */
        
        NotificationSystem ns = new NotificationSystem(7, 3, 1);
        
        
        Utilities.Print(Utilities.createDate(2016, 10, 32).toString());
       
        
        
        
        ApprovalQueue queue = new ApprovalQueue(new ArrayList<Student>());
        
        ArrayList<Deliverable> x = new ArrayList<Deliverable>();

        Teacher t = new Teacher("123", "Lasse", "Persen", "@", 1234, 12345);

        Module m = new Module("Modul 1", "Requirements", t.getFirstName() + " " + t.getLastName(), "Description", "goals");
        
        Feedback f = t.createFeedback("Kommentar", false);
        
        
        Deliverable d = new Deliverable(m, Utilities.createDate(2016, 10, 15), f);
        
        d.getFeedback().EditComment("Veldig bra, godkjent", true);
       
        
        x.add(d);
        
        Student s = new Student("123", "Ola", "davidsen", "@", 1234, 12345, x);
        queue.AddStudent(s);
        
        Deliverable ourdeliverable = s.getDeliverableforModuleName("Modul 1");
        
        
        if (ourdeliverable.isApproved()) {
            Utilities.Print("True");
            Utilities.Print(ourdeliverable.getFeedback().getComment());
        }
        
        
        queue.printQueue();
        
        
        Utilities.Print(ourdeliverable.getModule().getDescription());
        
        ns.checkDates(s);
        
        
    }
    
}
