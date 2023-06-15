package Sammu_1_Core_Java.Sammu_6_Package;

class calc{
    void sum(){
        int a=10;
        int b=20;
        System.out.println("a+b : " + a+b);
    }
}

class scCalc{
    void Sins(){
        System.out.println("SinA " +  Math.sin(20));
    }
}

class hyCals{
    void Sinsum(){
        int a=10;
        int b=20;
        System.out.println("a+b : "+ Math.sin(a+b));
    }
}

public class _7_Practice_Set_On_Packages_1_ {
    public static void main(String[] args) {
       calc c = new calc();
       c.sum();

       scCalc sc = new scCalc();
       sc.Sins();

       hyCals hy = new hyCals();
       hy.Sinsum();;
    }
}
