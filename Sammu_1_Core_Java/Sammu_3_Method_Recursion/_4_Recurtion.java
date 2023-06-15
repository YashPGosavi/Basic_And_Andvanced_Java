package Sammu_1_Core_Java.Sammu_3_Method_Recursion;
import java.util.Scanner;
//public class _4_Recurtioin {


    //Factorial
//    static int fact(int n){
//        if( n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n * fact(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter The Number Which You Want Factorial Of : ");
//        Scanner sammu = new Scanner(System.in);
//        int a = sammu.nextInt();
//        System.out.println("Factorial is : " + fact(a));
//    }

    //Fibonacci Series

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



public class _4_Recurtion {
    public static void main(String[] args) {
        System.out.println("Enter No. : ");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 1;i<Math.sqrt(n);i++){
            if(n%i==0){
                 flag = true;
            }
            else{
                flag = false;
            }
        }
        if(flag==true){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}

//public static int fact(int n){
//        if(n<=1){
//            return 1;
//        }
//        return n*fact(n-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(fact(n));
//
//    }
//}

//package com.PPL_Unit_4;
//        import java.util.Scanner;
//public class _20_Exception_handling {
//    public static void main(String[] args) {
//        System.out.println("Enter No. : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean prime = true;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                System.out.println("-");
//            } else {
//                System.out.println(n);
//            }
//        }
//    }
//}
