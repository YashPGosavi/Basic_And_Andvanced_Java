/*
Nested catch_try
When there are chances of occurring multiple exceptions to different types by the same set of statements
then such situation can be handled using the nested try statements.
 */
package Sammu_1_Core_Java.Sammu_8_Exception_Handling;

import java.util.Scanner;

public class _5_nested_try_catch {
    public static void main(String[] args){
        int [] marks = {45,645,54};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Index of Array : ");
        int a = sc.nextInt();
        System.out.println("Enter The Number You Want ot divide : ");
        int b = sc.nextInt();
        try{
            System.out.println("The result in try block : ");
            try{
                System.out.println("The result in nested try block 1 : Index value is : "+ marks[a]);
                try {
                    System.out.println("The result in nested try block 2 : Index value is : "+ marks[a]/b);
                }
                catch(ArithmeticException e){
                    System.out.println("Error : -You divide with zero.");
                    System.out.println("The result in nested catch block : \t" + e);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You Choose wrong Index.");
                System.out.println("The result in nested catch block : \t" + e);
            }
        }
        catch(Exception e){
            System.out.println("The result in catch block");
            System.out.println("Other Exception occur  : \t"+e);
        }
    }
}
