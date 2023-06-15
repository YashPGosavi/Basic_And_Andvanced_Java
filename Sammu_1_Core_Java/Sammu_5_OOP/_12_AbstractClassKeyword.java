/*
Abstract -> (Existing in thought)
1)In the inheritance hierarchy, the classes become more specific as we move down towards the subclasses
  and if we move up in this hierarchy classes become more general.
2)The superclass is supposed to be the most general or less specific. Sometimes superclass is so general
  and less specific that it does nothing but lists out only common features of other classes.
  Then such a superclass is refereed as abstract class.
3)If the class includes abstract methods, then the clas itself abstract.

  Abstract Classes and Methods
*Abstract class :- is a restricted class that cannot be used to create objects
 (to access it, it must be inherited from another class).
                        abstract class Base{};

*Abstract method :-  can only be used in an abstract class, and it does not have a body.
 The body is provided by the subclass (inherited from).
                         abstract void fun(){};

*The " abstract " keyword is used to define the abstract class.

 */
package Sammu_1_Core_Java.Sammu_5_OOP;
abstract class Base1{
      abstract void fun1();
     void fun2(){
        System.out.println("fun2 in Base1");
    }
}
class child1 extends Base1{
    @Override
     void fun1(){
        System.out.println("fun1 in child1");
    }
}

class child2 extends Base1{
    @Override
     void fun1(){
        System.out.println("fun1 in child1");
    }
}

public class _12_AbstractClassKeyword {
    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.fun1();
        c1.fun2();
        child2 c2 = new child2();
        c2.fun1();
        c2.fun2();

    }
}
