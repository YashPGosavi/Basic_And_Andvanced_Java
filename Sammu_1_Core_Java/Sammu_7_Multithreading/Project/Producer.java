package Sammu_1_Core_Java.Sammu_7_Multithreading.Project;

public class Producer extends Thread {
    
    Company c;

    Producer(Company c){
        this.c = c;
    }

    public void run(){
        int i = 1;
        while(true){
            try{
            this.c.produce_item(i++);
            Thread.sleep(1000);
            }catch(Exception e){};
        }

    }
}
