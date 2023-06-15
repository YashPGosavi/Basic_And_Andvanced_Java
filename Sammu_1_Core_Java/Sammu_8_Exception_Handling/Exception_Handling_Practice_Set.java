
//Q.1 : Write a program to demonstrate syntax, logical and runtime errors.
//package Sammu_1_Core_Java.Sammu_8_Exception_Handling;
//public class Exception_Handling_Practice_Set {
//    public static void main(String[] args) {
//        int a=2;
//        int b=10  // Syntax Error
//        int c = a/b;
//        System.out.println(c);
//
//        for(int i=10;i<0;i--){
//            System.out.println(i); //Logical error
//        }
//    }
//
//}

/*
****************************************************************************************************************************************************************************************************
 */

//Q.2 : Write a java Program that prints "HaHa" during ArithmeticException and "HeHe" During IllegalArgumentException.
//package Sammu_1_Core_Java.Sammu_8_Exception_Handling;
//
//import java.util.Scanner;
//
//public class Exception_Handling_Practice_Set {
//    public static void div(int a,int b){
//        int c = a/b;
//        System.out.println("The result is : "+c);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Values : ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        try{
//            div(a,b);
//        }
//        catch (ArithmeticException e){
//            System.out.println("HaHa");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("HeHe");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Question 2 is solved.");
//        }
//    }
//}

/*
 ****************************************************************************************************************************************************************************************************
 */

//Q.3 : Write a program that allows you to keep assuming an array until a valid index is given. If max is return exceed '5' Print "Error".
//Q.4 : Modify program in Q.3 to throw a custom exception in max retries is reached.
//Q.5 : Wrap the program in Q.3 inside a method which throws your custom Exception.
package Sammu_1_Core_Java.Sammu_8_Exception_Handling;
import java.util.Scanner;

class exp extends Exception{

    public String toString(){
        return "Custom toString Exception is thrown";
    }
    public String getMessage(){
        System.out.println();
        return "Custom getMessage Exception is thrown";
    }
}
public class Exception_Handling_Practice_Set {
    public static void main(String [] args){
        int [] Array={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No below 5");
        int a = sc.nextInt();
        while(a<5) {
            try {
                System.out.println("Enter the array index between 0-4: ");
                int index = sc.nextInt();
                System.out.println("Result is : " + Array[index]);
                a++;
                break;
            }
            catch (Exception e) {
                System.out.println("Error");
            }
        }
       if(a>=5) {
           try {
               throw new exp();
           } catch (exp r) {
               System.out.println(r.toString());
               System.out.println(r.getMessage());
               r.printStackTrace();
           }
           finally {
               System.out.println("Ends the Q.5");
           }
       }
        System.out.println("Bye");
    }
}

/*
 ****************************************************************************************************************************************************************************************************
 */
