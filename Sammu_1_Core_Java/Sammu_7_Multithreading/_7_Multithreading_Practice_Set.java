package Sammu_1_Core_Java.Sammu_7_Multithreading;


// Q.1 : Write a program to Print "Good Morning" and "Welcome" using thread.
// Q.2 : Add sleep method to Welcome.
// Q.3 : Demonstrate on getPriority() and setPriority() Method.
// Q.4 : Demonstrate the State of thread.
// Q.5 : Use currentThread() method.

class Myth_1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning!");
        }
    }
}
class Myth_2 implements Runnable{
     public void run(){
        while(true){
            System.out.println("You are Welcome!");
        }
    }
}

class Myth_3 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Nothing...");
            i++;
        }
    }
}
class Myth_4 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Ohkk...");
            i++;
        }
    }
}

public class _7_Multithreading_Practice_Set {
    public static void main(String[] args) {
//        Myth_1 m1 = new Myth_1();
//        m1.start();
//
//        Myth_2 m2 = new Myth_2();
//        Thread t1 = new Thread(m2);
//        t1.start();
//        try{
//            t1.sleep(200);
//        }
//        catch(Exception e){
//            System.out.println("E");
//        }

        Myth_3 m3 = new Myth_3();
        m3.start();
        System.out.println("Nothing Priority is :" + m3.getPriority());



        Myth_4 m4 = new Myth_4();
        System.out.println("State of Thread Before Start : " + m4.getState());

        m4.setPriority(10);
        m4.start();
        System.out.println("State of Thread after Start : " + m4.getState());

        System.out.println("Ohk Priority is : " + m4.getPriority());

        System.out.println(m4.currentThread().getState());
    }
}
