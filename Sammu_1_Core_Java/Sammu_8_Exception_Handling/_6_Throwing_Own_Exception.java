/*
//(__)//Trowing Own Exception.
**************************************************************************************************************************************************************************************************************************************************************************************************************************************************************

We can throw our own exceptions using the keyword throw.
• The syntax for throwing out own exception is - throw new Throwable subclass
• Here the Throwable subclass is actually a subclass derived from the Exception class.
        For Example :-
                    throw new MyOwnException();

**************************************************************************************************************************************************************************************************************************************************************************************************************************************************************

Using Exception Class in java :-
           We can write our own exception in java using extending Exception class.
                     For Example :-
                                public class MyException extends Exception{

                                    };

The Exception class have the following important Methods :-
1) String toString()        :- It execute when sout(e) is run.
2) void printStacktrace()   :- Print track trace.
3) String getMessage()      :- print the exception message.

**************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
*/

package Sammu_1_Core_Java.Sammu_8_Exception_Handling;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString()+"  :- toString() in extending Exception class";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+"  :- getMessage() in extending Exception class";
    }
}
public class _6_Throwing_Own_Exception {
    public static void main(String[] args) {
        System.out.println("Age is :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch(MyException e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                System.out.println("");
                e.printStackTrace();
            }
            System.out.println("Program Works Successfully.");
        }
    }
}
