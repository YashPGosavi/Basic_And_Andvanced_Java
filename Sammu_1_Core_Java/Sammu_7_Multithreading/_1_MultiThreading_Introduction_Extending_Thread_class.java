/*
Definition of thread : Thread is a tiny program running continuously. It is sometimes
called as light-weight process.

In Java we can implement the thread programs using two approaches
1.Using Thread class.
2.Using runnable interface.

there are two methods by which we can write the Java thread
programs one is by extending thread class and the other is by implementing the
Runnable interface.

The run method is the most important method in any threading program. By
using this method the thread's behaviour can be implemented. The run method can
be written as follows :-
public void run(){
//statements for implementing thread
}

For invoking the thread's run method the object of a thread is required. This object can
be obtained by creating and initiating a thread using the start() method.


 */

/*

Extending Thread Class
1.The Thread class can be used to create a thread.

2.Using the extend keyword your class extends the Thread class for creation of
  thread.
  For example if I have a class named A then it can be written as :-
                        class A extends Thread{
                        }

3.Constructor of Thread Class : Following are various syntaxes used for writing the
  constructor of Thread Class.
               Thread()
               Thread(String s)
               Thread(Runnable obj)
               Thread(Runnable obj, String s);

4.Various commonly used methods during thread programming are as given below -

start()     :- The thread can be started and invokes the run method.
run()       :- Once thread is started it executes in run method.
setName()   :- We can give the name to a thread using this method.
getName()   :- The name of the thread can be obtained using this name.
getId()     :- Provide id of thread.
getPriority :- Provide us Priority of thread.
join()      :- This method waits for thread to end.
Sleep()     :- To fix the time of execution of thread.
getState()  :- Give us ths State Of Thread.



Following program shows how to create a single thread by extending Thread Class.
 */
package Sammu_1_Core_Java.Sammu_7_Multithreading;
class Mythread1 extends Thread {
    @Override   // Method run is override.
    public void run() {
        int i = 0;
        while (i<190){
            System.out.println("Thread 1 ");
            System.out.println("I AM HAPPY");
            i++;
        }
    }
}
class Mythread2 extends Thread {
    public void run() {
        int i = 0;
        while (i<190){
            System.out.println("Thread 2 ");
            System.out.println("I AM SAD");
            i++;
        }
    }
}
public class _1_MultiThreading_Introduction_Extending_Thread_class {
    public static void main(String[] args){
        Mythread1 t1 =new Mythread1();
        t1.start();
        Mythread2 t2 =new Mythread2();
        t2.start();
    }
}
