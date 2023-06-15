package Sammu_1_Core_Java.Sammu_5_OOP;

//single inheritance
class Animal{
    void eat(){
        System.out.print("I am eating : ");
    }

}
class dog extends Animal{

    void eat_d()
    {
        System.out.println("Veg and Non-veg");
    }
}

public class _1_OOP_Inheritance{
    public static void main(String[] args){
        dog e = new dog();
        e.eat();
        e.eat_d();
    }
}

// Multilevel Inheritance
//class Add
//{
//    int add()
//    {
//
//        int a;
//        int b;
//        System.out.println("Enter Number For Addition : ");
//        Scanner sc =new Scanner(System.in);
//        a = sc.nextInt();
//        b= sc.nextInt();
//        int c = a+b;
//        System.out.println("The value of Super class : "+c);
//        return c;
//    }
//
//}
//
//class Sub extends Add
//{
//    int sub()
//    {
//        int d, e;
//        System.out.println("Entet Number For Subtraction : ");
//        Scanner sc = new Scanner (System.in);
//        d = sc.nextInt();
//        e= sc.nextInt();
//        int f = add()-(d-e);
//        System.out.println("The value of derived/child class : "+f);
//        return f;
//    }
//
//}
//class Call extends Sub
//{
//    public
//    void call()
//    {
//        Sub s = new Sub();
//        s.add();
//        s.sub();
//    }
//}
//
//public class  _22_Inheritace {
//    public static void main(String[] args)
//    {
//        Call c = new Call();
//        c.call();
//    }
//}


// Hirarchical Inhertance
//
//class Eat{
//    void eat(){
//        System.out.println("I am Eating");
//    }
//}
//class Veg extends Eat{
//    void veg()
//    {
//        System.out.println("I am veg");
//    }
//}
//
//class Non_veg extends Eat{
//    void non_veg(){
//        System.out.println("I am Non-Veg");
//    }
//}
//public class  _22_Inheritace {
//    public static void main(String[] args){
//        Eat e=new Eat();
//        e.eat();
//
//        System.out.println("**********************************************");
//
//        Veg v = new Veg();
//        v.eat();
//        v.veg();
//
//        System.out.println("**********************************************");
//
//        Non_veg nv = new Non_veg();
//        nv.eat();
//        nv.non_veg();
//    }
//}


//Hybrid Inhertance

//import java.sql.SQLOutput;

//class Eat{
//    void eat(){
//        System.out.println("I am Eating");
//    }
//}
//class Veg extends Eat{
//    void veg()
//    {
//        System.out.println("I am veg");
//    }
//}
//
//class Non_veg extends Eat{
//    void non_veg(){
//        System.out.println("I am Non-Veg");
//    }
//}
//
//class Tiger extends Non_veg {
//    void eat_t(){
//        Non_veg ng = new Non_veg();
//        ng.non_veg();
//        System.out.println("Tiger Is Non-Veg Animal");
//    }
//}
//public class  _22_Inheritace {
//    public static void main(String[] args){
//        Eat e=new Eat();
//        e.eat();
//
//        System.out.println("**********************************************");
//
//        Veg v = new Veg();
//        v.eat();
//        v.veg();
//
//        System.out.println("**********************************************");
//
//        Non_veg nv = new Non_veg();
//        nv.eat();
//        nv.non_veg();
//
//        System.out.println("**********************************************");
//
//        Tiger t =new Tiger();
//        t.eat();
//        t.eat_t();
//
//    }
//}