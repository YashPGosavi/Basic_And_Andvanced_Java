/*
Various commonly used methods during thread programming are as given below :-
            start()     :- The thread can be started and invokes the run method.
            run()       :- Once thread is started it executes in run method.
            setName()   :- We can give the name to a thread using this method.
            getName()   :- The name of the thread can be obtained using this name.
            getId()     :- Provide id of thread.
            getPriority :- Provide us Priority of thread.
            join()      :- This method waits for thread to end.
            Sleep()     :- To fix the time of execution of thread.
            getState()  :- Give us ths State Of Thread.

* isAlive() and join()
There are two methods that are commonly used while handling more than one thread
in the Java program and these methods are 1SAlive and join(). The purpose of these two
methods is to check whether a thread has finished Its execution or not.
 
1)The isAlive() Method
This method is used to check if the thread is alive or not. This method returns true if
thread is still running and not finished otherwise it returns false.
    Syntax :-
            public final boolean isAlive()

2)This method waits until the thread on which it is called terminates.
    Syntax :-
            final void join() throws Interrupted exception

  * Using join method, we tell our thread to wait until the specified thread completes its
    execution.
*/


package Sammu_1_Core_Java.Sammu_7_Multithreading;
class multh extends Thread{
    public multh(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Yash");
            i++;
        }
    }
}

class multh1 extends Thread{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Samiksha");
            i++;
        }
    }
}
public class _5_MultiThreading_Method {
    public static void main(String[] args){
        multh t1 = new multh("Samuu");
        t1.start();
        try {
            t1.join();
            t1.sleep(400);
        }
            catch(Exception e){
                System.out.println(e);
            }
        System.out.println("t1 Cheaking alive : "+ t1.isAlive());


        multh t12 = new multh("YAASSHH");
        t12.start();
        System.out.println("t12 Cheaking alive : "+ t12.isAlive());
        System.out.println("Name of t1 : "+ t1.getName());
        System.out.println("Name of t12 : "+ t12.getName());

        multh1 t2 = new multh1();
        t2.start();
        System.out.println("Name of t2: "+ t2.getName());
        t2.setName("Bannu");
        System.out.println("Name t1 after ( _setName()_) : "+ t2.getName());
        System.out.println("t2 Cheaking alive : "+ t2.isAlive());

    }
}