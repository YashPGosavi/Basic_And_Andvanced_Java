/*
There are three modifiers used in Java -
o public
o private
o default modifier
-> public allows classes, methods and data fields accessible from any class.
-> private allows classes, methods and data fields accessible only from within the own class.
-> If public or private is not used then by default the classes, methods, data fields are
   assessable by any class in the same package. This is called package-private or
   package-access. A package is nothing but the grouping of classes.
-> Protected mode is another access specifier which is used in inheritance. The protected
   mode allows accessing the members to all the classes and subclasses in the same package
   as well as to the subclasses in other package. But the non subclasses in other package can
   not access the protected members.

                     Class               Subclass             Package
    Private            Yes                   -                    -.
    Public             Yes                  Yes                  Yes.
    Protected          Yes                  Yes                  Yes.
 */
package Sammu_1_Core_Java.Sammu_4_AccessModifier_Constructor;

// class Mul_Div{
//    private int mul(int a,int b){
//         int c = a*b;
//        System.out.println(c);
//        return c;
//    }
//    protected int div(int a, int b){
//        int c = a/b;
//        System.out.println(c);
//        return c;
//    }
//    void mul_call() {
//        Mul_Div ml = new Mul_Div();
//        ml.mul(10, 10);
//    }
//
//}
//  public class Sammu_20_Access_Modifiers_Specifiers {
//    public int Add (int a, int b){
//        int c = a+b;
//        System.out.println(c);
//        return c;
//
//    }
//    public static void main(String[] args) {
//        Sammu_20_Access_Modifiers_Specifiers q = new Sammu_20_Access_Modifiers_Specifiers();
//        q.Add(12,21);
//
//        Mul_Div mldv = new Mul_Div();
//        mldv.mul_call();
//        mldv.div(110,10);
//    }
//}


// Make a program who shows the
import java.util.Scanner;
class circle{
    private double r,d,a;
    Scanner sc = new Scanner(System.in);

    private double setRadius(){
        System.out.println("Radius is : " + r);
        return r;
    }

    void getRadius(){
        System.out.println("Enter The Radius");
        r = sc.nextDouble();
        setRadius();
    }
   private void setDiameter(double d){
        this.d =d;
        if(d ==(2*r)){
            System.out.println("Diameter is Correct.");
            System.out.println("Correct Diameter is : "+ d );
        }
        else{
            System.out.println("You Set Wrong Diameter.");
            System.out.println("Correct Diameter is : "+ (2*r) );
        }
    }

    void getDiameter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Diameter");
        d = sc.nextDouble();
        setDiameter(d);
    }
    private void setArea(double a){
        this.a = a;
        if(a==(2*3.14*r)){
            System.out.println("Area is Correct.");
            System.out.println("Correct Area is : " + a);
        }
        else{
            System.out.println("You Set Wrong Area.");
            System.out.println("Correct Area is : " + (2*3.14*r));
        }
    }

    void getArea(){
        System.out.println("Enter The Area");
        a = sc.nextDouble();
        setArea(a);
    }
}

public class _1_Access_Modifiers_Specifiers {
    public static void main(String[] args) {
        circle c = new circle();
        c.getRadius();
        c.getDiameter();
        c.getArea();
    }
}