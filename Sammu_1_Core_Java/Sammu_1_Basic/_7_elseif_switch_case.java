package Sammu_1_Core_Java.Sammu_1_Basic;

import java.util.Scanner;

public class _7_elseif_switch_case {
    public static void main(String[] args) {
        System.out.println("Enter Your Age : ");
        Scanner age = new Scanner(System.in);
        int x = age.nextInt();

        /*...*/ //if...elseif...if
//        if (x < 18) {
//            System.out.println("You are Teenager.");
//        } else if (x > 18 && x < 40) {
//            System.out.println("You are Young.");
//        } else {
//            System.out.println("Your are Old.");
//        }


        /*...*/ // Switch Case.
        switch (x) {
            case 18:
                System.out.println("You are Teenager.");
                break;
            case 40:
                System.out.println("You are Young.");
                break;
            case 60:
                System.out.println("Your are Old.");
                break;
        }
    }
}
