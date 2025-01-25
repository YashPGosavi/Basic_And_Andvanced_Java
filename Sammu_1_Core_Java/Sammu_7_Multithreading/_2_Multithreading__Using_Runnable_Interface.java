/*
Using Runnable Interface :-
1.The thread can also be created using Runnable interface.
2.Implementing thread program using Runnable interface is preferable than
 implementing it by extending the thread class because of the following two
 reasons :-
        1. If a class extends a thread class then it can not extends any other class which
            may be required to extend.
         2. If a class thread is extended then all its functionalities get inherited.
         This is an expensive operation.
 */

/*
Thread Model // Thread Life-Cycle
The Thread model represents the life cycle which specifies how a thread gets
processed in the Java program. By executing various methods. Following figure
represents how a particular thread can be in one or the state at any time.

            getState()  :- Give us ths State Of Thread.

1)New state :-
             ->When a thread starts its life cycle it enters the new state or a create state.

2 Runnable state :-
             ->This is a state in which a thread starts executing.
             ->Waiting state
             ->Sometimes one thread has to undergo in waiting state because another thread starts executing.

3) Timed waiting state :-
             ->There is a provision to keep a particular threading waiting for some time interval.
               This allows to execute high prioritized threads first. After the timing gets over,
               the thread in waiting state enters in runnable state.

4) Blocked state :-
             ->When a particular thread issues an Input/Output request then operating system
               sends it in blocked state until the I/O operation gets completed. After the I/0
               completion the thread is sent back to the runnable state.

5) Terminated state :-
             ->After successful completion of the execution the thread in runnable state enters the
               terminated state.


 */
package Sammu_1_Core_Java.Sammu_7_Multithreading;
class MyThreadRunnable1 implements Runnable {
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I Am Yash");
        }
    }
}

class MyThreadRunnable2 implements Runnable{

    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I Am Gosavi");
        }
    }
}
public class _2_Multithreading__Using_Runnable_Interface {
    public static void main(String[] args){
        Mythread1 O1 = new Mythread1();
        Thread t1 = new Thread(O1);
        t1.start();

        Mythread2 O2 = new Mythread2();
        Thread t2 = new Thread(O2);
        t2.start();
    }
}
