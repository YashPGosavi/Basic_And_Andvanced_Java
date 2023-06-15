/*
Que.1)Create three classes Calculator, Sc Calculator and HybridCalculater and group them into a package.
Que.2)Use built in packge in java to write a class which which display a messege (By Using System.out.printl();) 
      aftet taking input from user
Que.3)Create a package n class with 
Que.4)
*/
package folder1.folder2.folder3;
import java.util.Scanner;
class calc{
    void sum(){
        int a=10;
        int b=20;
        System.out.println("a+b : " + a+b);
    }
}

class hyCals{
    void Sinsum(){
        int a=10;
        int b=20;
        System.out.println("a+b : "+ Math.sin(a+b));
    }
}

class scCalc{
     void Sins(){
        System.out.println("SinA " + Math.sin(20));
    }
}
 
public class Prob
{
    public static void main(String[] args) {
       calc c = new calc();
       c.sum();

       scCalc sc = new scCalc();
       sc.Sins(); 

       hyCals hy = new hyCals();
       hy.Sinsum();;
    }
}
