/*
Interfaces can extend another Interfaces and implements another class.
    interface Interface1{
         public void fun1();}
    interface Interface2{
          public void fun2();
 */
package Sammu_1_Core_Java.Sammu_5_OOP;
interface interfaceBase{
    public void fun1();
    public void fun2();
}
interface interfaceChild extends interfaceBase{
    public void fun3();
    public void fun4();
}
class sample implements interfaceChild{
    public void fun1(){
        System.out.println("Fun1");
    }
    public void fun2(){
        System.out.println("Fun2");
    }
    public void fun3(){
        System.out.println("Fun3");
    }
    public void fun4(){
        System.out.println("Fun4");
    }
}
public class _15_Inheritace_in_Interface  {
    public static void main(String arg[]){
        sample s =  new sample();
        s.fun1();
        s.fun2();
        s.fun3();
        s.fun4();
    }
}
