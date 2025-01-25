/*
\\*__*\\
Interface-> in english two system meet and interact.
1)Interface is a mechanism to achieve abstraction in java.
2)Interface is similar to abstract class but having all the methods of
 abstract type i.e. it cannot have a method body.
3)Since Java 8, we can have default and static methods in an interface.
4)Since Java 9, we can have private methods in an interface.
5)We Can't create the object of interface.
6)Interface implements using "implement" keyword.
7)We can achieve multiple inheritance using Multiple Interfaces.

*->Syntax :-
access modifier interface name_of_interface
{
return type method name 1(parameter1,parameter2,...parameter);
...
return type method name1 (parameter1,parameter2....parameter);
type static final variable name=value;
...
}

*-> The access-modifier specifies the whether the interface is public or not.
*-> If the access specifier is not specified for an interface then that interface
   will be accessible to all the classes present in that package only.
*-> But if the interface is declared as public, then it will be accessible to any of the class.
*-> The methods declared within the interface doesn't contain the body. It is expected that these
   methods must be defined within the class definition.

\\*__*\\
Uses of Interface
1. It is used to achieve abstraction.
2. By interface, we can support the functionality of multiple inheritance.
3. It can be used to achieve loose coupling.

\\*__*\\
*-> Variables in Interfaces
  The variables can be assigned with some values within the interface. They are
  implicitly final and static. Even if you do not specify the variables as final and static
  they are assumed to be final and static.
  The members of interface are static and final because
           1) The reason for being static - The members of interface belong to interface only and not object.

           2) The reason for being final - Any implementation can change value of fields if
                                           they are not defined as final.
                                           Then these members would become part of the implementation.
                                           An interface is pure specification without any implementation.
*/


/*
\\*__*\\
*-> Similarities between Abstract class & interfaces
1. Both can contain abstract methods.
2. We cannot create an instance of abstract class & interfaces.

\\*__*\\
*-> Difference between Abstract class & Interfaces.

Abstract Class                                                                   Interfaces

1.  The class is denoted by a keyword class.                         1. The interface is denoted by a keyword interface.

2.  Abstract class can have instance methods                         2. Methods of a Java interface are implicitly
    that implements a default behavior.                                 abstract and cannot have implementations.

3.  An abstract class may contain non-final                          3. Interface contains public, static & final
    variables.                                                          variables only.

4.  Methods & variables can have any access-modifier                 4. Methods & variables are always public.
    i.e. public, protected, default & private

5.  Java abstract class should be extended                           5. Java interface should be implemented
    using keyword "extends".                                            using keyword "implements"

6.  An abstract class can extend another Java                        6. An interface can extend another Java
    class and implement multiple Java interfaces.                       interface only.

7.  The class contains data members and methods.                     7. The interfaces may contain data members and
    But the methods are defined in class                                methods but the methods are not defined. The
    implementation. Thus class contains an executable                   interface serves as an outline for the class.
    code.
 */


/*
 \\*__*\\
*-> Extending Interfaces
    interfaces can be extended similar to the classes. That means we can derive
    subclasses from the main class using the keyword extend, similarly we can derive
    the interfaces from main interfaces by using the keyword extends.
    The syntax is :-
                    interfaces interfaces_name1 extends interfaces_name2

*-> Even-though methods are declared inside the interfaces and sub-interfaces, these
    methods are not allowed to be defined in them. Note that methods are defined only in the
    classes and not in the interfaces.

 */

package Sammu_1_Core_Java.Sammu_5_OOP;
//interface Bycycle{
//    int a =45;
//    void applyBrack(int a);
//    void applySpeedUP(int a);
//}
//
//interface Horn{
//    void blowHorn();
//    void blowHorn_song();
//}
//class Avon implements Bycycle,Horn{
//    void cycleName(){
//        System.out.println("This is Avon Cycle");
//    }
//    @Override
//    public void applyBrack(int a) //override method of interface is required to assign public
//    {
//        System.out.println("Speed is decrement with : "+a+"km/h");
//    }
//
//    @Override
//    public void applySpeedUP(int a) {
//        System.out.println("Speed is increment with : "+a+"km/h");
//    }
//
//    public void blowHorn(){
//        System.out.println("blowingHorn po po po pe pe pe...");
//    }
//
//    public void blowHorn_song(){
//        System.out.println("Dhoom Machale Dhoo Machale Dhoom...");
//    }
//}
//public interface Sammu_33_Interface {
//    public static void main(String[] args) {
//        Avon avon = new Avon();
//        avon.applyBrack(5);
//        avon.applySpeedUP(20);//You can create properties in Interface.
//        avon.cycleName();
//        System.out.println(avon.a);
//        //avon.a=23;    //You can't modify properties of interface as they are final.
//
//        System.out.println();
//
//        avon.blowHorn();
//        avon.blowHorn_song();
//    }
//}

/*
 \\*__*\\
*-> Creation and Implementation of Interface
   It is necessary to create a class forever interfaces.
   The class must be defined in the following form while
   using the interface :-
             class Class_name extends superclass_name
             implements interface_name1,interface name2....


          Cellphone              GPS                Camera                  Media Player
              |                   |                   |                          |
               __________________________________________________________________
                                               |
                                          Smartphone

 ->What is actually Multiple Inheritance :-
                            Multiple inheritance is a mechanism in which the child class inherits properties from more than one base class.


 */


class Cellphone{
    int number;
    public void call(int number){
        this.number=number;
        System.out.println("Calling..."+number);
    }
    public void pickCall() {
        this.number=number;
        System.out.println("Call is connected..."+number);
    }

}

interface GPS{
    public void trackMyLocation();}

interface Camera{
    public void takeSnap();
    public void recordVideo();
    default public void record4kVideo(){
        System.out.println("recording in 4K...");
    }
}
interface Media_player{
    public void playSong();
    public void playVideo();
}
class Smartphone extends Cellphone implements GPS, Camera, Media_player{
    @Override

    public void trackMyLocation(){
        System.out.println("Your Location is tracked...");
    }
    public void takeSnap(){
        System.out.println("Snap is taken...");
    };
    public void recordVideo(){
        System.out.println("Video is recorded...");
    };

    public void playSong(){
        System.out.println("Song is noe playing...");
    };
    public void playVideo(){
        System.out.println("Video is playing...");
    }
}


public class _13_Interface {
    public static void main(String[] args) {
        Smartphone s =new Smartphone();
        s.call(940411);
        s.pickCall();
        s.trackMyLocation();
        s.takeSnap();
        s.recordVideo();
        s.playSong();
        s.playVideo();
    }
}
