/*
Commonly used Constructors of Thread class:
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r,String name)
 */
package Sammu_1_Core_Java.Sammu_7_Multithreading;

//class myth1 extends Thread{
//    public myth1( String name){
//        super(name);
//    }
//    public void run(){
//        int i = 0;
//        while(i<1){
//            System.out.println("Hii, I Am Coming");
//            i++;
//        }
//    }
//}
//class myth2 extends Thread{
//    public myth2( String name){
//        super(name);
//    }
//    public void run(){
//        int i = 0;
//        while(i<1){
//            System.out.println("TO MEET YOU!");
//            i++;
//        }
//    }
//}
//public class _3_MultiThreading_Constructor_Method {
//    public static void main(String[] args){
//        myth1 t1 = new myth1("Yeah");
//        t1.start();
//        myth2 t2 = new myth2("Samiksha");
//        t2.start();
//
//
//        System.out.println("The Id is : "+ t1.getId());   //getId() :- Provide id of thread.
//        System.out.println("Name of t : "+ t1.getName());   //getName() :- The name of the thread can be obtained using this name.
//        System.out.println("The Priority of t1 thread : " + t1.getPriority()); //getPriority :- Provide us Priority of thread.
//        t1.setName("Yash");
//        System.out.println("Name t1 after ( _setName()_) : "+ t1.getName()); //setName() :- We can give the name to a thread using this method.
//
//        System.out.println("************************************************************************");
//
//        System.out.println("The Id is : "+ t2.getId());
//        System.out.println("Name of t2: "+ t2.getName());
//        System.out.println("The Priority of t2 thread : " + t2.getPriority());
//        t2.setName("Bannu");
//        System.out.println("Name t2 after ( _setName()_) : "+ t2.getName());
//
//    }
//}
//


class myth1 implements Runnable{
    myth1(){
        super();
        System.out.println("I am Constructor");
    }
    public void run(){
        int i=0;
        while(i<1){
            System.out.println("Hi");
            i++;
        }
    }
}

class myth2 implements Runnable{

    public void run(){
        int i = 0;
        while(i<1){
            System.out.println("Good Day...!");
            i++;
        }
    }
    Runnable r = new Runnable(){
        public void run(){
            System.out.println("YASH");
        }
    };
}

public class _3_MultiThreading_Constructor_Method {
    public static void main(String[] args) {
        myth1 m1 = new myth1();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}