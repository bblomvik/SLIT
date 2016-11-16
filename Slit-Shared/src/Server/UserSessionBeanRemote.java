/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.ejb.Remote;

/**
 *
 * @author Terje
 */
@Remote
public interface UserSessionBeanRemote {


    void insertUser(int userid, String firstName, String lastName, String email, String phoneNumber, String username, String password); 
    

    
}
