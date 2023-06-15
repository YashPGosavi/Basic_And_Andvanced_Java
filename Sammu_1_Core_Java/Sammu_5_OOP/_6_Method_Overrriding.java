/*
Method Overriding.
        Method Overriding is a mechanism in which a subclass inherits the methods of superclass and sometimes
the subclass modifies the implementation of a method defined in superclass.
1)The method of superclass which gets modified in subclass has the same name and
type signature.
2)The overridden method must be called from the subclass.
3)When an object of subclass is created and an overriden method is called, then the method which has been implemented
  in subclass is called.

\\*__*\\
Rule Followed By Method Overriding / Properties :-
1)The private data fields in superclass are not accessible to the outside class.
 Hence, the method of superclass using the private data field cannot be overridden by the
 subclass.
2)An instance method can be overridden only if it is accessible. Hence, private method
 cannot be overridden.
3)The static method can be inherited but cannot be overridden.
4)Method overriding occurs only when the name of the two methods and their type signatures (parameter's) are same.
5)final method can't be inherited can't be overridden.

//

 */
package Sammu_1_Core_Java.Sammu_5_OOP;
class Class_A{
     int mod(int n){
        int c = n*3;
        System.out.println("Method in class Class_A : "+c);
        return 1;
    }
}
class Class_B extends Class_A{
    @Override
    int mod(int n){
        super.mod(12);
        int c = n%3;
        System.out.println("Method in class Class_B : "+c);
        int d = c+3;
        System.out.println("Value of d : "+ d);
        return 1;
    }

    int mod(int n,int m) //This is not an override method because parameter are not same.
    {
        System.out.println("This is not an override method because parameter are not same : "+n+ " "+m);
        return 0;
    }
}

public class _6_Method_Overrriding {
    public static void main(String[] args){
        Class_B b = new Class_B();
        b.mod(2);
        b.mod(1,2);


    }
}
