/*
********************************************************************************************************************************************************************************************************************
• The constructor is a specialized method for initializing objects.
• Name of the constructor is same as that of its class name. In other words, the name of
  the constructor and class name is same.
• Whenever an object of its associated class is created, the constructor is invoked automatically.
• The constructor is called constructor because it creates values for data fields of class.
********************************************************************************************************************************************************************************************************************
 1. Name of constructor must be the same as the name of the class for which it is being used.
 2. The constructor must be declared in the public mode.
 3. The constructor gets invoked automatically when an object gets created.
 4. The constructor should not have any return type. Even a void data type should not
    be written for the constructor.
 5. The constructor can not be used as a member of union or structure.
 6. The constructors can have default arguments.
 7. The constructor can not be inherited. But the derived class can invoke the
    constructor of base class.
 8. Constructor can make use of new or delete operators for allocating or releasing memory respectively.
 9. Constructor can not be virtual.
10. Multiple constructors can be used by the same class.
********************************************************************************************************************************************************************************************************************
-=->Type of Constructor.
 1. No argument(Default) constructor.
    Constructor in which no argument or parameter is passed.
 2. Parameterized constructor.
    Constructor in which parameter is passed.
 3. Copy constructor.
      Copy constructor is a kind of constructor which can be initialized using the object of the same class.
      This object is created already. The use of copy constructor is :-
                 i. To initialize one object from another object of same type.
                ii. The object can be passed as a parameter to the function.
               iii. The copy of the object can be returned from the function.
********************************************************************************************************************************************************************************************************************
Calling Of Constructor.
-> Parent,s Class constructor call before Subclass constructor.
-> calling of constructor occurs from top to bottom.
********************************************************************************************************************************************************************************************************************
 */

package Sammu_1_Core_Java.Sammu_4_AccessModifier_Constructor;

class constructor{
    int a,b,c;
    public constructor(){
        System.out.println("Constructor(Default) is Initialized");
    }

    public constructor(int a){
        this.a =a;
        System.out.println("Parameterised Constructor is Initialized");
    }

    public constructor(constructor c){
        System.out.println("Copy Constructor is Initialized");
    }

}

public class _2_constructor {
    public static void main(String[] args) {
        constructor a = new constructor();   // Calling Default Constructor.

        constructor b = new constructor(10);   // Calling Parameterised Constructor.

        constructor c = new constructor(a);   // Calling Copy Constructor.
    }
}
