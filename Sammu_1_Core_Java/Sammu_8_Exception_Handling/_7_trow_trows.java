/*
• throw -    This keyword is used to throw specific exception from the program code. 
• throws -   It specifies the exceptions that can be thrown by a particular method.

 */
package Sammu_1_Core_Java.Sammu_8_Exception_Handling;

import java.util.Scanner;

public class _7_trow_trows {
    public static int divide(int a,int b) throws ArithmeticException{
        int c = a/b;
        System.out.println("The result is : "+ c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            divide(a,b);
        }
        catch(Exception e){
            System.out.println("Exception You Divide with Zero :- " + e);
        }
    }
}
