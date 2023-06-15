package Sammu_1_Core_Java.Sammu_3_Array;

import java.util.Scanner;

public class _2_Sorting_the_Array {
    public static void main(String[] args) {

        /*Taking Input And Create Array*/
        System.out.println("The Array Size You Want : " );
         Scanner arr= new Scanner(System.in);
         int n = arr.nextInt();
         int a [] = new int[n];
        System.out.println("Enter Array Element : ");
        for (int i = 0; i < n; i++) {
             a[i] = arr.nextInt();
        }
        System.out.println("The Array is : ");
        for (int j=0; j<n; j++)
        {
            System.out.print(a[j] + " ");
        }

        System.out.println("\n*******************************************");

        /*Sorting Of Array*/
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("The Sorted Array is : ");
        for (int b : a) {
            System.out.print( b + " ");
        }
        System.out.println(a[n-1]);
    }
}