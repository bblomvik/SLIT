/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.base;

import Utilities.Utils.Utilities;
import java.util.ArrayList;


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
        ArrayList<Deliverable> x = new ArrayList<Deliverable>();

        Teacher t = new Teacher("123", "Lasse", "persen", "@", 1234, 12345);

        Module m = new Module("Modul 1", "Requirements", t.getFirstName() + " " + t.getLastName(), "Description", "goals");
        
        Feedback f = t.createFeedback("Kommentar", false);
        
        
        Deliverable d = new Deliverable(m, "date", f, f.isApproved());
        
        x.add(d);
        
        Student s = new Student("123", "Ola", "davidsen", "@", 1234, 12345, x);
        
        Utilities.Print(s.GetDeliverableforModuleName("Modul 1").getComment().getComment());
        
        
    }
    
}
