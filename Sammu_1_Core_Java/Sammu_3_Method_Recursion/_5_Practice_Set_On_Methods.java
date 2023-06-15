package Sammu_1_Core_Java.Sammu_3_Method_Recursion;

import java.util.Scanner;

public class _5_Practice_Set_On_Methods {

    /*...*/ //Multiplication Table
//    static void multiplication(int n){
//        for(int i=1; i<=10 ; i++){
//            System.out.println( i + " X " + n + " = " + i*n);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter No : ");
//        Scanner table = new Scanner(System.in);
//        int a = table.nextInt();
//        multiplication(a);
//    }


    /*...*/ // Make this kind of structure using methods.
//*
//* *
//* * *
//* * * *
//* * * * *

//    static void pat(int n) {
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j<i; ++j)
//                System.out.print("*");
//            System.out.print("\n");
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter No : ");
//        Scanner a = new Scanner(System.in);
//        int a1 = a.nextInt();
//        pat(a1);
//    }


//   *
//  ***
// *****
//*******

//    static void pat(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = n - 1; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter No : ");
//        Scanner a = new Scanner(System.in);
//        int a1 = a.nextInt();
//        pat(a1);
//    }


//        *
//      * *
//    * * *
//  * * * *
//* * * * *

//    static void pat(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = (n - 1); j >= i; --j) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i-1; ++k) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter No : ");
//        Scanner a = new Scanner(System.in);
//        int a1 = a.nextInt();
//        pat(a1);
//    }
//
//static void patt(int n){
//    if(n==0)
//
//        return;
//    patt(n-1);
//    System.out.print(" ");
//    System.out.print("* ");
//    }
//    static void pattern(int n, int i)
//    {if (n == 0)
//            return;
//        patt(i);
//        System.out.println();
//        pattern(n - 1, i+1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter No : ");
//        Scanner a = new Scanner(System.in);
//        int a1 = a.nextInt();
//        pattern(a1,1);
//    }

//    *****
//     ****
//      ***
//       **
//        *


//    static void patt(int n){
//        for(int i=n;i>=0;--i){
//            for(int j=i;j>=0;--j){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
//    }
//    public static void main(String[] args){
//        System.out.println("Enter no : ");
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        patt(b);
//
//    }


    /*...*/ //Write a recurive function to calculate sum of first "n" natural numbers.

//    static int sum(int n) {
//       if(n==1){
//           return 1;
//       }
//        return n + sum(n-1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter the Natural No. Which You Want to sum Upto: ");
//        Scanner sum = new Scanner(System.in);
//        int a = sum.nextInt();
//        a = sum(a);
//        System.out.print( "The Sum of Natural Number : " + a );
//    }


    /*...*/ //write a function to print fibonacci series.


    //Write a function to print nth term of fibonacci series using recursion(0,1,1,2,3,5,8,13...)

//    static int a = 0, b = 1, c;
//    static void fibrec(int n) {
//        if (n >= 1) {
//            c = a + b;
//            System.out.print( " "+c );
//            a = b;
//            b = c;
//            fibrec(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter No : ");
//        Scanner sammu = new Scanner(System.in);
//        int d = sammu.nextInt();
//        System.out.print(a+" "+ b);
//        fibrec(d);
//    }


//    // Write a function to convert Celsius temperature into Fahrenhite.
//
//    static double a=1.8,b=32,c;
//    static double far(double n) {
//            c = (n * 1.8) + 32;
//            return c;
//    }
//    public static void main(String args[]){
//        System.out.println("Enter Temperature in Celsius : ");
//        Scanner temp = new Scanner(System.in);
//        double t = temp.nextDouble();
//        System.out.println("The Temperature in Fahrenhite is : "+far(t));
//    }


    //Repeat 3 using iteration approach

//    static int rep(int n){
//        for ( int i=0;i<n;i++){
//            System.out.println((i+1)+ " Iteration : "+" "+3);
//        }
//        System.out.println(" ");
//        return n;
//    }
//        public static void main(String args[]){
//            System.out.println("Enter no. of Iteration of 3 you want : ");
//            Scanner sc = new Scanner(System.in);
//            int b = sc.nextInt();
//            System.out.println(" Iterations :-");
//            System.out.println("Total No. Of Iteration : "+rep(b));
//    }

        //Sorry
    public static void main(String[] args) {
        int x ;
        int i=0;
        sorry : do{
            System.out.println("Please Accept My Sorry😞");
            System.out.println("\n1)Sorry is not Accepted😡️\n2)I accept your sorry☺️");
            System.out.println("Enter You decision: ");
            Scanner sc = new Scanner(System.in);
            x=sc.nextInt();
             switch (x) {
                case 1:
                    while( i <=10) {
                    System.out.println("I Am Sorry🥹\n");
                    i++;
                }
                 break ;

                case 2:
                    System.out.println("\n❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️Thank You To Accepting My Sorry!❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️❣❣️️");
                    break sorry;

            }
        }while(x!=2);
    }
}



