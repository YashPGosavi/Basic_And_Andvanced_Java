package Sammu_1_Core_Java.Sammu_5_OOP;
import java.util.*;


//Q.1
/*__*/
/*create  a class Employee with fallowing properties and methods :
salary (property)(int)
getSalary (method returning int)
name (property) (string)
getName(method returning string)
setName(method to changing name)
 */

//class employee {
//    int salary;
//    String name;
//
//    int getSalary() {
//        return salary;
//    }
//
//    void setName(String n) {
//        name = n;
//    }
//
//    String getName() {
//        System.out.print("Your Name Is : ");
//        return name;
//    }
//}
//public class Sammu_18_OOP{
//    public static void main(String[] args) {
//        employee e1 = new employee();
//        e1.salary=12000;
//
//        e1.setName("Yash");
//        System.out.println(e1.getName());
//        System.out.println("Your Salary Is : "+e1.getSalary());
//    }
//}

//Q.2
/*
Create a class cellphone with methods to print
"Ringing...","Vibrating"
 */
//class phone{
//    void ringing(){
//        System.out.println("Ringing....");
//    }
//    void vibrating(){
//        System.out.println("vibrating....");
//    }
//}
//
//public class Sammu_18_OOP {
//    public static void main(String[] args) {
//        phone p = new phone();
//        p.ringing();
//        p.vibrating();
//    }
//}


//Q.3
/*
Create a Cass Square with a method to initialise its
side. Calculating area, perimeter etc
 */

//class square{
//    int n;
//    void side(){
//        System.out.println("Each Side Of Square Is Of Length : "+n);
//    }
//    void area(){
//        System.out.println("Area Of Square is : "+ (n*n));
//    }
//    void parameter(){
//        System.out.println("Parameter Of Square is : "+(4*n));
//    }
//    void diagonal(){
//        System.out.println("The Diagonal of Square is :"+ (n/(Math.sqrt(2))));
//    }
//}
//public class Sammu_18_OOP {
//    public static void main(String[] args) {
//        square s = new square();
//        System.out.println("Enter Side Of Square  : " );
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        s.n=a;
//          s.side();
//          s.area();
//          s.parameter();
//          s.diagonal();
//
//    }
//}

//Q.4
/*
Create a Cass Rectangle with a method to initialise its
side. Calculating area, perimeter etc
 */
//class rectangle{
//    double a,b;
//    void area(){
//        System.out.println("Area of given rectangle is : "+ (a*b));
//    }
//    void parameter(){
//        System.out.println("Parameter of given triangle is : "+ ((2*a)+(2*b)));
//    }
//
//    void diagonal(){
//        double c = Math.sqrt((a*a)+(b*b));
//        System.out.println("Diagonals of given triangle is : "+ c);
//    }
//}
//public class Sammu_18_OOP {
//    public static void main(String[] args) {
//        rectangle rec =new rectangle();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length of Rectangle : ");
//        double a = sc.nextDouble();
//        System.out.println("Enter Breath of Rectangle : ");
//        double b = sc.nextDouble();
//
//        rec.a=a;
//        rec.b=b;
//
//        rec.area();
//        rec.parameter();
//        rec.diagonal();
//    }
//}

//Q.5
/*
Create a Cass Circle with a method to initialise its
Radius. Calculating area, circumference etc
 */
//
//class circle{
//    double r;
//
//    void diameter(){
//        System.out.println("Diameter of circle : "+(2*r));
//    }
//    void area(){
//        System.out.println("Area of given circle is : "+ (3.14*(r*r)));
//    }
//    void circumference(){
//        System.out.println("circumference of given circle is : "+ ((2*3.14*r)));
//    }
//
//}
//public class Sammu_18_OOP {
//    public static void main(String[] args) {
//        circle cir =new circle();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Redius of circle : ");
//        double a = sc.nextDouble();
//
//        cir.r=a;
//
//        cir.diameter();
//        cir.area();
//        cir.circumference();
//    }
//}

//Q.7
/*
Create a Game By Creating a class TommyVecetti For rockstar game capable of hitting, running, Firing.
 */

class TommyVecetti{
    int hitting (){
        System.out.println("Hitting the enemy.");
        return 1;
    }
    int running (){
        System.out.println("Running from the enemy.");
        return 2;
    }
    int Firing (){
        System.out.println("Firing on the enemy.");
        return 3;
    }
}
public class _2_OOP_Practice_Set {
    public static void main(String[] args) {
        int x =0;
        game:
        do {
            TommyVecetti t = new TommyVecetti();
            int ply_1, Comp_It;
            Random r = new Random();

            System.out.println("Round " + (x+1) );
            //For Player
            System.out.println("Enter Your Choice : \n1)Hitting the enemy.\n2)Running from the enemy.\n3)Firing on the enemy.");
            Scanner sc = new Scanner(System.in);
            ply_1 = sc.nextInt();
            System.out.print("Your Choice is : ");
            switch (ply_1) {
                case 1:
                    t.hitting();
                    break;

                case 2:
                    t.running();
                    break;

                case 3:
                    t.Firing();
                    break;
            }

            if (ply_1 > 3) {
                System.out.println("Invalid Selection");
                break game;
            }

            //For Computer.
            Comp_It = r.nextInt(0, 4);
            System.out.print("Computer is : ");
            switch (Comp_It) {
                case 1:
                    t.hitting();
                    break;

                case 2:
                    t.running();
                    break;

                case 3:
                    t.Firing();
                    break;
            }


            //Win Or Loss Condition
            if (ply_1==Comp_It){
                System.out.println("Draw!");
            }
            else if(ply_1 == 1 && Comp_It==2 || ply_1==3 && Comp_It==1 || ply_1==3 && Comp_It==2){
                System.out.println("You Win!");
            }
            else{
                System.out.println("You Loss!");
            }

            System.out.println("*************************************************************");
            x++;
        } while(x<3);
    }
}