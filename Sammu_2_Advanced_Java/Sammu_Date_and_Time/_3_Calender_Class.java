/*
Java Calendar class is an abstract class that provides methods
for converting date between a specific instant in time
and a set of calendar fields such as MONTH, YEAR, HOUR, etc.
It inherits Object class and implements the Comparable interface.
 */
package Sammu_2_Advanced_Java.Sammu_Date_and_Time;

import java.util.Calendar;
import java.util.TimeZone;

public class _3_Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());


        System.out.println(c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR_OF_DAY) +":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println();
    }
}
