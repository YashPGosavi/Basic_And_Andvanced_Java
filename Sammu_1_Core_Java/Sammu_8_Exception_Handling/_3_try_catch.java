/*
• try -      A block of source code that is to be monitored for the exception
• catch -    The catch block handles the specific type of exception along with the try block.
             (Note that for each corresponding try block there exists the catch block)

  1) The statements that are likely to cause an exception are enclosed within a try block.
     (For these statements the exception is thrown.)
  2) There is another block defined by the keyword catch
     which is responsible for handling the exception thrown by the try block.
  3) As soon as exception occurs it is handled by the catch block.
     The catch block is added immediately after the try block.
 */
package Sammu_1_Core_Java.Sammu_8_Exception_Handling;


public class _3_try_catch {
    public static void main(String args[]){
        //ArithmeticException
        try{
            int a=5;
            int b=a/0;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero.\n"+e);
        }
        System.out.println("Exception is Catched");
    }

    }



