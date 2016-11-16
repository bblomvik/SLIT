/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Database.Feedback;
import Database.Teacher;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Terje
 */
@Stateless
public class FeedbackSessionBean implements FeedbackSessionBeanRemote {
    @PersistenceContext(unitName = "Slit-Server-ejbPU")
    private EntityManager em;
    
    public void insertFeedback(String feedbackID, String teacherID, String teacherComment, Boolean approvalstauts){
        Feedback feedback = new Feedback();
        
        feedback.setFeedbackID(feedbackID);
        feedback.setTeacherID(em.find(Teacher.class, teacherID));
        feedback.setTeacherComment(teacherComment);
        feedback.setApprovelStatus(approvalstauts);
                
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void bussinessMethode(String parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
