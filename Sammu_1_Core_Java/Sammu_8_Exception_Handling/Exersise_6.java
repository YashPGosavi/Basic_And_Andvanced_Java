/*
    Question : You have to create a custom calculator with following operations:
                1) + --> Addition.
                2) - --> Subtraction.
                3) * --> Multiplication.
                4) / --> Division.

                which throws the following exceptions:
                1) Invalid input Exception ex: 8 & 9
                2) CannotDivideByZeroException.
                3) MaxInputException if any of the inputs is greater than 100000.
                4) MaxMultiplierReachedException Don't allow any multiplication input to be greater than 7800.
                */
package Sammu_1_Core_Java.Sammu_8_Exception_Handling;

import java.util.Scanner;

class CannotDivideByZeroException extends Exception{
    CannotDivideByZeroException(){
        System.out.println("You can't divide any Number by zero");
    }
    public String toString(){
        return  super.toString()+"CannotDivideByZeroException";
    }
}

class MaxInputException extends Exception{
    MaxInputException(){
        System.out.print("Put values below than 100000: Custom MaxInputException is thrown :- ");
    }
    public String toString(){
        return super.toString()+"MaxInputException";
    }
}

class MaxMultiplierReachedException extends Exception{
    MaxMultiplierReachedException(){
        System.out.println("Multiplication input should below 7800");
    }

    public String toString(){
        return super.toString()+ "MaxMultiplierReachedException";
    }
}

class InvalidInputException extends Exception{
    InvalidInputException(){
        System.out.print("Put values below than 100000: Custom InvalidInputException is thrown :- ");
    }
    public String toString(){
        return super.toString()+"InvalidInputException";
    }
}

class cal{
    public double a,b;
    void add()
    {
        double sum = a+b;
        System.out.println("Addition is : "+sum);
    }

     void sub(){
        double sub = a-b;
        System.out.println("Subtraction is " + sub);
    }
     void mult() throws MaxMultiplierReachedException{
        double mult;
         mult = a * b;
        if (a > 7801 || b > 7801) {
            try {
                throw new MaxMultiplierReachedException();
            } catch (Exception e) {
                System.out.println("Maximum Limit of Multiplier is crossed" + e.toString());
            }
        }
    }
     void div() throws CannotDivideByZeroException{
        double div;
         div=a/b;
        if(a==0 || b==0){
            try{
                throw new CannotDivideByZeroException();
            }
            catch(Exception e)
            {
                System.out.println("Cannot divide by 0 Exception "+e.toString());
                System.out.println("Division is : "+div);
            }
        }
        else{
            System.out.println("Division is : "+div);

        }
    }

}

public class Exersise_6 {
    public static void main(String[] args) throws InvalidInputException, MaxInputException, CannotDivideByZeroException,MaxMultiplierReachedException {
        cal cal = new cal();
        Scanner sc = new Scanner(System.in);
        int i=0;
        String yn = null;
        do{
            System.out.println("******************************************************************\n");
            System.out.println("1)Addition.\n2)Subtraction.\n3)Multiplication.\n4)Division.\n5)Exit.");
            System.out.print("Enter Your Choice : ");
            int c = sc.nextInt();
            if(c>4) {
                System.out.println("Thanks For Visiting Our Calculator.");
                break;
            }

            double a,b;
            System.out.println("Enter 1st No. :  ");
            a = sc.nextDouble();
            System.out.println("Enter 2nd No. :  ");
            b= sc.nextDouble();
            cal.a=a;
            cal.b=b;
            if(a>100000 || b>100000){
                try{throw new MaxInputException();
            }
                catch (MaxInputException e){
                    System.out.println(e.toString());
                }
                break;
                }

            System.out.print("The result of ");

             switch(c){
                case 1 :
                    cal.add();
                    break;
                case 2 :
                    cal.sub();
                    break;
                case 3 :
                    cal.mult();
                    break;
                case 4 :
                    cal.div();
                    break;
                case 5 :
                    System.out.println("Thanks For Using Our Calculator.");
                    break;
            }

            if(c<5){
                System.out.println("Dou You Want to Continue Y/N : ");
                yn = sc.next();
            }
    }while(i<6 || (yn == "n"|| yn =="N"));
    }
}