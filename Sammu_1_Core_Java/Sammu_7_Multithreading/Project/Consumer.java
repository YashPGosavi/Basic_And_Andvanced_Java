package Sammu_1_Core_Java.Sammu_7_Multithreading.Project;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            try {
            this.c.consume_item();
                Thread.sleep(1000);
            } catch (Exception e) {};

        }
    }
}
