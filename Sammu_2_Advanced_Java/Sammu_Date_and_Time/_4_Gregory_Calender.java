package Sammu_2_Advanced_Java.Sammu_Date_and_Time;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class _4_Gregory_Calender {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("The Time zone is :- " + c.getTimeZone());
        System.out.println(TimeZone.getAvailableIDs()[7]);
        System.out.print("Check Leap Year Enter Year : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean leap_year = false;
        if(c.isLeapYear(n)==true){
            leap_year=true;
        }
        else{
            leap_year=false;
        }
        if(leap_year==true){
            System.out.println(n+" :--> This is leap Year.");
        }
        else{
            System.out.println(n+" :--> This is Not-leap Year.");
        }
    }
}
