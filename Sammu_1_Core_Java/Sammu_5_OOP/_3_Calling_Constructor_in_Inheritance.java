package Sammu_1_Core_Java.Sammu_5_OOP;
//Parent,s Class constructor call before Subclass constructor this is called constructor chaining.
//calling of constructor occurs from top to bottom.
//When super keyword use then only it call the parameterised constructor.
class Base{
    Base(){
     System.out.println("Calling of Constructor Class Base");
    }

    Base(int a) {
    System.out.println("I am An Overloaded Constructor of Class Base With the Values of : " + a);
}
}
class  Derived extends Base{
    Derived(){
        System.out.println("Calling of Constructor Class Derived");
    }
    Derived(int a,int b){
        super(1); //When super keyword use then only it calls the parameterised constructor.
        System.out.println("I am An Overloaded Constructor of Class Derived With the Values of : " + a + " and "+b);
    }
}
class ChildOfDerived extends  Derived{
    ChildOfDerived(){
        System.out.println("Calling of Constructor Class ChildOfDerived");
    }
    ChildOfDerived(int a,int b,int c){
        super(1,2); //When super keyword use then only it calls the parameterised constructor.
        System.out.println("I am An Overloaded Constructor of Class ChildOfDerived With the Values of : " + a + " , "+ b +" and "+ c);
    }
}
public class _3_Calling_Constructor_in_Inheritance {
    public static void main(String[] args) {
        ChildOfDerived a = new ChildOfDerived();
        System.out.println("****************************************************************************************************");
        ChildOfDerived b = new ChildOfDerived(1,2,3);
    }
}
