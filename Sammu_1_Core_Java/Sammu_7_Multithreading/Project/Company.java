package Sammu_1_Core_Java.Sammu_7_Multithreading.Project;

public class Company {
    int n = 1;

    boolean f = true;

    synchronized public void produce_item(int n) throws Exception {
        if(!f){
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        f = false;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if(f){
            wait();
        }
        System.out.println("Consumed : " + this.n);
        f = true;
        return this.n;
    }

}
