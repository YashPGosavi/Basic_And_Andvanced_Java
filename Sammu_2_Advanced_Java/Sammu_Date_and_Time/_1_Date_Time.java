/*
Date and Time
    java.time :- package for Date and Time in java (From java 8 onward).

How java store the time :-
    Data is stored in form of long number. This long number holds a number of milliseconds passed since 1 jan 1970;

    Java is assumes that 1900 is start Year.

    System.currentTimeMillis(); It returns the count of millisecond
 */
package Sammu_2_Advanced_Java.Sammu_Date_and_Time;
public class _1_Date_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
    }
}