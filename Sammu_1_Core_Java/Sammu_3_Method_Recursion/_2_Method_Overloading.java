package Sammu_1_Core_Java.Sammu_3_Method_Recursion;

public class _2_Method_Overloading {
    static void n1(){
        System.out.println("Hi, Good Morning!");
    }
    static void n1(int a){
        System.out.println("Hi, Good Morning " + a + " bro!");
    }
    static void n1(int a,int b){
        System.out.println("Hi, Good Morning " + a + " bro!");
        System.out.println("Hi, Good Morning " + b + " brother!");
    }

    public static void main(String[] args) {
        n1();
        n1(300);
        n1(3000, 4000);
    }
}
