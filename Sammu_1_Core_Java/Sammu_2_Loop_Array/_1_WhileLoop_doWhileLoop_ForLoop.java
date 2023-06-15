package Sammu_1_Core_Java.Sammu_2_Loop_Array;

import java.util.Scanner;

public class _1_WhileLoop_doWhileLoop_ForLoop {
    public static void main(String[] args) {

        /*...*/ // While loop.
//        int a = 1;
//        while(a<=10) // We can only use boolean as a condition in java.
//        {
//            System.out.println(a);
//            a++;
//        }


        /*...*/ // do...while loop.
//        int a = 1;
//        do{
//            System.out.println(a);
//            a++;
//        }while(a<=10);


        /*...*/ // For loop.
//        for(int i = 1 ; i<=10; i++){
//            System.out.println(i);
//        }


        /*...*/ // Find Odd Number In Revers Order Using For Loop.
//        for(int i = 49 ; i>=0; i--){
//            System.out.println(2*i+1);
//        }

        System.out.println("Enter No. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++) {
            fact=fact*i;
        }
        System.out.println("The Factorial is : " + fact);

    }
}
