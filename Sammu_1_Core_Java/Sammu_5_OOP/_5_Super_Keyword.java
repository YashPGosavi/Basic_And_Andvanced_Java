package Sammu_1_Core_Java.Sammu_5_OOP;

/* Super keyword use for -
           Super is a keyword used to access the immediate parent class object from subclass.
-> There are three ways by which the keyword super is used.
    1)For parent class instance variable invocation (super.variableName;)
    2)For parent class method invocation (super.methodName;)
    3)For parent class constructor invocation ( super();)

-> " super " keyword always write inside the method;
 */

class A{
    int a;
    int c=10;
    A(int i){
        this.a=i;
        System.out.println("Constructor is initialize.");
    }

    void show(){
        System.out.println("Constructor Value initialize (By parent method invocation) : "  + a );
    }
}
class B extends A{
    int b;
    int c = 3;

    B(int i){
         super(i); // parent constructor invocation
        b = i+super.c;
        System.out.println("parent variable invocation : "+super.c); //parent variable invocation
        System.out.println("B initialize for super keyword call");
    }


    void show_1(){
        super.show();   //parent method invocation.
        System.out.println("Value of B initialize : "  + b );
    }

    public static void main(String[] args) {
        B call = new B(20);
        call.show_1();

    }
}