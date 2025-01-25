/*
Thread Priority :-
1. In Java threads scheduler selects the threads using their priorities.
2. The thread priority is a simple integer value that can be assigned to the particular thread.
3. These priorities can range from 1 (the lowest priority) to 10 (highest priority).
4. There are two commonly used functionalities in thread scheduling
            | 1) setPriority |
            | 2) getPriority |
5. The function setPriority is used to set the priority to each thread
                Thread_Name setPriority(priority val);
6. The priority_val is a constant value denoting the priority for the thread.
    It is defined as follows :-
        o MAX PRIORITY = 10.
        o MIN PRIORITY = 1.
        o NORM PRIORITY = 5.
5. The function getPriority is used to get the priority of the thread.
        Thread Name.getPriorityU;

**Preemption**
o Preemption is a situation in which when the currently executed thread is
    suspended temporarily by the highest priority thread.
o The highest priority thread always preempts the lowest priority thread.
 */

package Sammu_1_Core_Java.Sammu_7_Multithreading;

class mythh extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("1");
            i++;
        }
    }
}
class mythh1 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("2");
            i++;
        }
    }
}

class mythh2 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("3");
            i++;
        }
    }
}
public class _4_Multithreading_Priority {
    public static void main(String[] args) {
        mythh t = new mythh();
        t.setPriority(1); //o MIN PRIORITY =1 // t = 1
        t.start();

        mythh1 t1 = new mythh1();
        t1.setPriority(10); //o MAX PRIORITY = 10 // t = 2
        t1.start();

        mythh2 t2 = new mythh2();
        t2.setPriority(5); //o MIN PRIORITY = 5 // t = 3
        t2.start();

        System.out.println("Priority of 1 : "+t.getPriority());
        System.out.println("Priority of 2 : "+t1.getPriority());
        System.out.println("Priority of 3 : "+t2.getPriority());
    }
}
