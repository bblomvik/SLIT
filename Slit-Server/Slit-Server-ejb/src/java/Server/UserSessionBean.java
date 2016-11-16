/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Database.Student;;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Terje
 */
@Stateless
public class UserSessionBean implements UserSessionBeanRemote {

    @PersistenceContext(unitName = "Slit-Server-ejbPU")
    private EntityManager em;


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void insertUser(int userid, String firstName, String lastName, String email, String phoneNumber, String username, String password) {
       
        try{
        
            Student student = new Student(); 

            student.setFirstName(firstName);
            student.setLastname(lastName);
            student.setPhonenumber(phoneNumber);
            student.setStudentID(Integer.toString(userid));
            student.setEMail(email);
            student.setPhonenumber(phoneNumber);

            em.persist(student);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        

        
    }
 
    public void persist(Object object) {
        em.persist(object);
    }


}
