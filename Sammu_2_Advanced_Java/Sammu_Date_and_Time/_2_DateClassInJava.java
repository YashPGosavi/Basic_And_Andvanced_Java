/*

 */

package Sammu_2_Advanced_Java.Sammu_Date_and_Time;

import java.util.Date;

public class _2_DateClassInJava {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println("getYear : "+d.getYear());
        System.out.println("getMonth : "+d.getMonth());
        System.out.println("getDay : "+d.getDay());
        System.out.println("getDate : "+d.getDate());
        System.out.println("getHours : "+d.getHours());
        System.out.println("getMinutes : "+d.getMinutes());
        System.out.println("getSeconds : "+d.getSeconds());
    }
}
