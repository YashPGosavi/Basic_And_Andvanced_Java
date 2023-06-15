package Sammu_1_Core_Java.Sammu_3_Method_Recursion;

public class _13_Overloading {
    void sum (int a,int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String args[]){
        _13_Overloading s = new _13_Overloading();
        s.sum(1,2);
        s.sum(12.1,12.1);
        s.sum(1,2,3);
    }
}
