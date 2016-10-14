/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.base;
import java.util.Date;
import Utilities.Utils.Utilities;



/**
 *
 * @author mathiashartveit1
 */
public class NotificationSystem {
    
    int firstWarning;
    int secondWarning;
    int finalWarning;

    /**
     * A system for delivering notifications to students and teachers 
     * based on factors such as date and completion.
     * 
     * @param firstWarning - The first day the student should get a notification from the system about delivery.
     * @param secondWarning - The second day the student should get a notification from the system about delivery.
     * @param finalWarning  - The final day the student should get a notification from the system about delivery.
     */
    public NotificationSystem(int firstWarning, int secondWarning, int finalWarning) {
        this.firstWarning = firstWarning;
        this.secondWarning = secondWarning;
        this.finalWarning = finalWarning;
    }
    
    
    
    
    
    /**
     * Checks if any of the students deliverables is close to their due date.
     * 
     * @param student - The student which deliverables should be checked.
     */
    public void checkDates(Student student) {
        for (int i = 0; i < student.deliverable().size(); i++) {
            Deliverable deliverable = student.deliverable().get(i);
            // Send a message to the student if the current date is close to delivery date! For now, we just print a warning.
            
            // If this deliverable has been approved, 
            // we just get out as there is no need to alert the studen.
            if (deliverable.isApproved()) {
                return;
            }
            
            String moduleName = deliverable.getModule().getModuleName();
            
            if (Utilities.daysApart(Utilities.getDate(), deliverable.getDate()) == firstWarning) {
                Utilities.Print(""+firstWarning + " dager til innleveringsfrist for " + moduleName + "!");
            }
            
            if (Utilities.daysApart(Utilities.getDate(), deliverable.getDate()) == secondWarning) {
                Utilities.Print(""+secondWarning + " dager til innleveringsfrist for " + moduleName + "!");
            }
            
            if (Utilities.daysApart(Utilities.getDate(), deliverable.getDate()) == finalWarning) {
                String day = "dag";
                
                // In case the notification systems final warning is bigger than one day.
                if (finalWarning > 1) {
                    day = "dager";
                }
                Utilities.Print(""+finalWarning + " " + day + " til innleveringsfrist for " + moduleName + "!");
            }
        }
    }

    
    
    
}
