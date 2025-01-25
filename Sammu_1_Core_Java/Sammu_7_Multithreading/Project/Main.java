package Sammu_1_Core_Java.Sammu_7_Multithreading.Project;

public class Main {

    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();;
        c.start();
    }  
}
