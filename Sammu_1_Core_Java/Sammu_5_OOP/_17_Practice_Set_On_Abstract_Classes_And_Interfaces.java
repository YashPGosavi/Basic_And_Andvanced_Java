package Sammu_1_Core_Java.Sammu_5_OOP;
/*
Q.1) Create a abstract class Pen with method write() and refill() as abstract method and crete a method ChangeNib().
 */

//abstract class Pen {
//     abstract void write(String W);
//     abstract void refill();
//}
//class Fountain_Pen extends Pen{
//    @Override
//     void write(String W){
//        System.out.println("I am writting : "+W);
//    }
//     void refill(){
//        System.out.println("I am Refilling the Pen.");
//    }
//    void ChangeNib(){
//        System.out.println("Changing the Nib");
//    }
//}
//public class Sammu_37_Practice_Set_On_Abstract_Classes_And_Interfaces {
//    public static void main(String[] args) {
//        Fountain_Pen p = new Fountain_Pen();
//        p.write("Hi, I am Yash.");
//        p.refill();
//        p.ChangeNib();
//    }
//}


//***********************************************_____________________________________________***********************************************//


/*
Q.2) Create a class monkey with jump and bite methods, Create a class Human which inherits s Monkey Class
     and implements BasicAnimal interface with eat() and sleep method.
 */

//class Monkey{
//    public void jump(){
//        System.out.println("I can Jump.");
//    }
//    public void bite(){
//        System.out.println("I can Bite.");
//    }
//}
//interface BasicAnimal{
//    public void eat();
//    public void sleep();
//}
//
//class Human extends Monkey implements BasicAnimal{
//    @Override
//    public void eat(){
//        System.out.println("Human can Eat Both Veg And Non-Veg");
//    }
//    @Override
//    public void sleep(){
//        System.out.println("Human should sleep at least six hours a day. ");
//    }
//}
//
//public class Sammu_37_Practice_Set_On_Abstract_Classes_And_Interfaces {
//    public static void main(String[] args) {
//        Human h =new Human();
//        h.jump();
//        h.bite();
//        h.eat();
//        h.sleep();
//
//        Monkey b = new Human();
//        b.jump();  // --> -> --> This is not possible because it states that the Human class are only refers to the methods of Monkey interface.
//        b.bite();
//
//        // b.eat();
//        // b.sleep();
//
//    }
//}


//***********************************************_____________________________________________***********************************************//


/*
Q.3) Create a class Telephone with ring() lift() and disconnect() methods as abstract methods
     Create another class SmartTelephone and demonstrate polymorphism.
 */

//abstract class Telephone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//class SmartTelephone extends Telephone{
//    void ring(){
//        System.out.println("Ringing");
//    }
//    void lift(){
//        System.out.println("Lifting The Telephonr");
//    };
//    void disconnect(){
//        System.out.println("Disconnecting the call");
//    }
//    void fax(){
//        System.out.println("Sending the fax...");
//    }
//}
//public class Sammu_37_Practice_Set_On_Abstract_Classes_And_Interfaces {
//    public static void main(String[] args) {
//        Telephone t = new SmartTelephone();
//        t.ring();
//        t.lift();
//        t.disconnect();
//
//        // t.fax();  --> This is not allowed.
//
//        System.out.println("*************************************************************************************");
//
//        SmartTelephone s = new SmartTelephone();
//        s.ring();
//        s.lift();
//        s.disconnect();
//        s.fax();
//    }
//}


//***********************************************_____________________________________________***********************************************//


/*
Q.4) Create interface TVRemote and use it to inherit another interface SmartTVRemote, Create  a class TV which implements TVRemote interface.
 */

interface TVRemote{
   public void signal();
}
interface SmartTVRemote extends TVRemote{
    public void touchScreen();
}
class TV implements TVRemote{
    public void signal() {
        System.out.println("TV Remote Signal is Required to change the channel. ");
    }
}
public class _17_Practice_Set_On_Abstract_Classes_And_Interfaces {
    public static void main(String[] args) {
        TV t = new TV();
        t.signal();
    }
}




























