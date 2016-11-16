/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Server.TeacherSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Terje
 */
public class TeacherManager {
       
        private TeacherSessionBeanRemote lookupUserSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            //return (UserSessionBeanRemote) c.lookup("java:comp/env/TeacherSessionBean");
            return (TeacherSessionBeanRemote) c.lookup("java:global/Slit-Server-ejb/TeacherSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
    
    public void insertTeacher(int teacherID, String firstName, String lastName, String email, String phoneNumber, String username, String password){
        this.lookupUserSessionBeanRemote().insertTeacher(teacherID, firstName, lastName, email, phoneNumber, username, password);
    }
}
