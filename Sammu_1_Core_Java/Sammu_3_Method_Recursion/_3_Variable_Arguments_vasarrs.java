package Sammu_1_Core_Java.Sammu_3_Method_Recursion;

import java.util.Scanner;

public class _3_Variable_Arguments_vasarrs {
    static int add(int ...arr)  // Array is crated and call is done.
    {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
    static  int mult(int ...arr)
    {
     int mul = 1;
     for( int a : arr){
         mul *= a;
     }
     return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of 1,2 : " + add(a,b));
        System.out.println("Sum of 1,2,3 : " + add(1, 2, 3));
        System.out.println("Sum of 1,2,3,4 : " + add(1, 2, 3, 4));

        System.out.println("******************************************************************");

        System.out.println("Multiplication of 1,2 : " + mult(1, 2));
        System.out.println("Multiplication of 1,2,3 : " + mult(1, 2, 3));
        System.out.println("Multiplication of 1,2,3,4 : " + mult(1, 2, 3, 4));
    }
}
