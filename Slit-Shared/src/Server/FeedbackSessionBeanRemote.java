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
public interface FeedbackSessionBeanRemote {
     void bussinessMethode(String parameters);
    /**
     *
     * @param feedbackID
     * @param teacherID
     * @param teacherComment
     * @param approvalstauts
     */
        void insertFeedback(String feedbackID, String teacherID, String teacherComment, Boolean approvalstauts);
}