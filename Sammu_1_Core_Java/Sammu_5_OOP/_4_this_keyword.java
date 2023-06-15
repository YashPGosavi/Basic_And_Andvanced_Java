/*
1) The "This" keyword is use by a method to refer to object to invoke that method.
2) The this keyword is used inside the method definition to refer the current object.
   That means this is a reference to the object which is used to invoke it.
 */
package Sammu_1_Core_Java.Sammu_5_OOP;

public class _4_this_keyword {
    int a ,b;
     void add(int a,int b){
        this.a=a;
        this.b=b;
    }
     void display(){
         int d;
         d=a;
        int c= a+b;
        System.out.println("Value of c (That is a+b) : "+c);
        System.out.println("Value of d : " + d);
    }
    public static void main(String args[]){
         _4_this_keyword a = new _4_this_keyword();
         a.add(12,12);
         a.display();
    }
}
