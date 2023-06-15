/*
->Dynamic Method Dispatch(Run Time Polymorphism).
1)The dynamic method dispatch is also called as runtime polymorphism.
2)During the run time polymorphism, a call to overridden method is resolved at run time.
3)The overridden method is called using the reference variable of a super class (or base class).
  The determination of which method to invoke is done using the object being referred by the reference variable.
 */

package Sammu_1_Core_Java.Sammu_5_OOP;

class MyBase{
    void showBase(){
        System.out.println("showBase method from class MyBase.");
    }
    void display(){
        System.out.println("Method in class Base.");
    }
}
class MyChild extends MyBase{

    void showChild(){
        System.out.println("showChild method from class MyChild.");
    }
    @Override
    void display(){
        System.out.println("Method in class Child.");
    }

}
public class _9_Dynamic_Method_Dispatch_ {
    public static void main(String[] args) {
        MyBase b = new MyChild();
        b.display(); // Only Override Method is Allow get called from class MyChild(Child).
        b.showBase(); // Allowed
//        b.showChild(); // Not Allowed
    }

}
