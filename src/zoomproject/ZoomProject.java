/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomproject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Namin
 */
public class ZoomProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = GregorianCalendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat();
        System.out.println(format.format(cal.getWeekYear()));
    }
    
}
