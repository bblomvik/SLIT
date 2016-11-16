/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Terje
 */
public interface TeacherSessionBeanRemote {
        void businessMethod(String parameter);

        void insertTeacher(int teacherid, String firstName, String lastName, String email, String phoneNumber, String username, String password); 

}
    

