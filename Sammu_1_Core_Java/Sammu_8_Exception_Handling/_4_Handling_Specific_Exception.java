/*
Handling Specific Exception
• There may be the situations in which different exceptions may get raised by a single try
  block statements and depending upon the type of exception thrown it must be caught.
• To handle such situation multiple catch blocks may exist for the single try block statements.
 */
package Sammu_1_Core_Java.Sammu_8_Exception_Handling;

import java.util.Scanner;

public class _4_Handling_Specific_Exception {
    public static void main(String[] args) {
        int[] marks = {13, 34, 56};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index : ");
        int a = sc.nextInt();
        System.out.println("Enter No. with you want to divide : ");
        int b = sc.nextInt();
        try {
            System.out.println("The result:- ind_val/number :" + marks[a] / b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occurs");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occurs");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some Other Exception Occurs");
            System.out.println(e);
        }
    }
}


