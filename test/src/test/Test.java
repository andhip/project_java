/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author rikya
 */
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.TimeZone;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      //Getting the current date value
      LocalDate currentdate = LocalDate.now();
      System.out.println("Current date: "+currentdate);
      //Getting the current day
      int currentDay = currentdate.getDayOfMonth();
      System.out.println("Current day: "+currentDay);
      //Getting the current month
      Month currentMonth = currentdate.getMonth();
      System.out.println("Current month: "+currentMonth);
      //getting the current year
      int currentYear = currentdate.getYear();
      System.out.println("Current month: "+currentYear);
      
      
      
      //Java calendar in default timezone and default locale
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
     
        System.out.println("current date: " + getDate(cal));
     
     
        //adding days into Date in Java
        cal.add(Calendar.DATE, 2);
        System.out.println("date after 2 days : " + getDate(cal));
     
        //subtracting days from Date in Java
        cal.add(Calendar.DATE, -2);
        System.out.println("date before 2 days : " + getDate(cal));
     
     
       //adding moths into Date
        cal.add(Calendar.MONTH, 5);
        System.out.println("date after 5 months : " + getDate(cal));
     
        //subtracting months from Date
        cal.add(Calendar.MONTH, -5);
        System.out.println("date before 5 months : " + getDate(cal));
     
        //adding year into Date
        cal.add(Calendar.YEAR, 5);
        System.out.println("date after 5 years : " + getDate(cal));
     
        //subtracting year from Date
        cal.add(Calendar.YEAR, -5);
        System.out.println("date before 5 years : " + getDate(cal));
     
        //date after 200 days from now, takes care of how many days are in month
        //for years calendar takes care of leap year as well
        cal.add(Calendar.DATE, 200);
        System.out.println("date after 200 days from today : " + getDate(cal));
     
        System.out.println("current time in GMT: " + getTime(cal));
     
        //adding hours into Date
        cal.add(Calendar.HOUR_OF_DAY, 3);
        System.out.println("Time after 3 hours : " + getTime(cal));
     
        //subtracting hours from Date time
        cal.add(Calendar.HOUR_OF_DAY, -3);
        System.out.println("Time before 3 hours : " + getTime(cal));
     
        //adding minutes into Date time
        cal.add(Calendar.MINUTE, 3);
        System.out.println("Time after 3 minutes : " + getTime(cal));
     
        //subtracting minutes from Date time
        cal.add(Calendar.HOUR_OF_DAY, -3);
        System.out.println("Time before 3 minuets : " + getTime(cal));
     
    }
 
    /**
     *
     * @return current Date from Calendar in dd/MM/yyyy format
     * adding 1 into month because Calendar month starts from zero
     */
    public static String getDate(Calendar cal){
        return "" + cal.get(Calendar.DATE) +"/" +
                (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR);
    }
 
    /**
     *
     * @return current Date from Calendar in HH:mm:SS format
     *
     * adding 1 into month because Calendar month starts from zero
     */
    public static String getTime(Calendar cal){
        return "" + cal.get(Calendar.HOUR_OF_DAY) +":" +
                (cal.get(Calendar.MINUTE)) + ":" + cal.get(Calendar.SECOND);
    }
   }
