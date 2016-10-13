/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Mathias
 */
public class Utils {
    
     
    public static class Utilities {
       
        static GregorianCalendar calendar = new GregorianCalendar();
        
        /**
         * Prints a string based on System.out.println()
         * 
         * @param output - The string to be printed
         */
        public static void Print(String output) {
            System.out.println(output);
       }
        
       /**
        * 
        * @return - The current date in the format of "Thu Oct 13 12:45:44 CEST 2016"
        */
       public static Date getDate() {
           return calendar.getTime();
       }
       
       /**
        * Constructs a new date based on the specified parameters.
        * 
        * @param year - The year of the new date.
        * @param month - The month of the new date between 1-12
        * @param day - The day of the date.
        * @return 
        */
       public static Date createDate(int year, int month, int day) {
           // Note: GregorianCalendar already considers overflow of dates.
           // We don't have to do anything else here.
           return new GregorianCalendar(year, (month-1), day).getTime();
       }
       
       
       public static int daysApart(Date one, Date two) {
           int daysApart = (int)((two.getTime() - one.getTime()) / (1000*60*60*24l));
           return daysApart;
       }
       
    
    }
       
   

    }
    
    
   
    
