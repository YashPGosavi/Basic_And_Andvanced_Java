/*
1) Sometimes because of execution of try block the execution gets break off. And due to this some
   important code (which comes after throwing off an exception) may not get executed.
   That means, sometimes try block may bring some unwanted things to happen.
2) The finally block provides the assurance of execution of some important code that must be executed after the try block.
3) Even though there is any exception in the try block the statements assured by finally block are sure to execute.
   These statements are sometimes called as clean up code.
                The syntax of finally block is :-
                        finally{
                           //clean up code that has to be executed finally
                        };
 */
package Sammu_1_Core_Java.Sammu_8_Exception_Handling;

import java.util.Scanner;

class MyExcep extends Exception{
    public  String toString(){
        System.out.println("This is my Exception.");
        return super.toString()+"You Divide with Zero.";
    }
}
public class _8_finally_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c;
        if (a == 0 || b == 0) {
            try {
                throw new MyExcep();
            } catch (MyExcep e) {
                System.out.println(e.toString());
            }
            finally{
                System.out.println("Program is completed.");
            }
        }
        else{
            c = a / b;
            System.out.println("Result is : "+c);
        }


    }
}
