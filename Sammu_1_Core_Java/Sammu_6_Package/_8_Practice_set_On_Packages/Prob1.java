/*
Que.1)Create three classes Calculator, Sc Calculator and HybridCalculater and group them into a package.
Que.2)Use built in packge in java to write a class which which display a messege (By Using System.out.printl();) 
      aftet taking input from user
Que.3)Create a package n class with 
Que.4)
*/
package Sammu_1_Core_Java.Sammu_6_Package._8_Practice_set_On_Packages;

class calc1{
    void sum(){
        int a=10;
        int b=20;
        System.out.println("a+b : " + a+b);
    }
}

class hyCals1{
    void Sinsum(){
        int a=10;
        int b=20;
        System.out.println("a+b : "+ Math.sin(a+b));
    }
}

class scCalc1{
     void Sins(){
        System.out.println("SinA " + Math.sin(20));
    }
}
 
public class Prob1
{
    public static void main(String[] args) {
       calc1 c = new calc1();
       c.sum();

       scCalc1 sc = new scCalc1();
       sc.Sins(); 

       hyCals1 hy = new hyCals1();
       hy.Sinsum();;
    }
}
