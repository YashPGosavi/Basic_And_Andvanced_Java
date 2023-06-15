/*
Polymorphism means having many forms of method having same name.
1) Using object of corresponding class corresponding method is invoked by the same function fun.
2) The same function fun is used to execute the methods of various class.
3) The selection of the method of the class (i.e. toString method) depends upon the instance of the object
which is passed to the function fun. Which implementation is to be used is determined dynamically by the
Java Virtual Machine. This mechanism is called dynamic binding.
 */

package Sammu_1_Core_Java.Sammu_5_OOP;
class P1{
   public String toString(){
        System.out.println("Method in class P1");
        return "P1";
   }
}
class P2 extends P1{
    public String toString(){
         new P1();
        System.out.println("Method in class P2");
        return "P2";
    }
}

class P3 extends P2{
    public String toString(){
        System.out.println("Method in class P3");
        return "P3";
    }

}


public class _7_Polymorphism_{
    public static void main(String args[]){
        fun(new P1());  //(new use to invoke the method from class c)
        fun(new P2());
        fun(new P3());
    }
     static void fun(Object x){
        System.out.println(x.toString()); /*If we invoke the toString method, by default then it returns a string which describes the object.
                                         This returned string consists of the character " @ " and object's memory address in hexadecimal form.
                                        But we can override the toString method.*/
    }

}



