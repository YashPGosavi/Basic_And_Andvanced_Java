package Sammu_1_Core_Java.Sammu_4_AccessModifier_Constructor;
/*
Final keyword applies on three places
1)For declaring variable (final variableName)
    when variable declare with final then it cannot be modified further
2)For declaring method (final methodName)
    when final keyword declare with method then method overriding is avoided. that means method cannot be overridden.
3)For declaring the class (final class className)
    if we declare particular class as final, no class is derived from it. It used to stop inheritance.
 */

 final class Addition{
     final void add(int a,int b){
        int c = a+b;
        System.out.println("addition is : "+ c);
    }
    void display(){
        Addition a = new Addition();
        a.add(12,12);
    }
}

//class b extends Addition{  // Class cannot inherited
//     void add(int a,int b) //Method cannot override
//     {
//        final int x = 20;
//                 x = 30; // variable cannot modified
//         int c=a+b+d;
//         System.out.println("addition is : "+ c);
//     }
//}
class c{
     int a;
    final void fun(int i){
         this.a=i;
         System.out.println(a);
     }

}

//class d extends c{
//    int a;
//     void fun(int i) //method can't be overriden because method define sa final
//     {
//        this.a=i;
//        System.out.println(a);
//    }
//}

public class _3_Final_Keyword {
    public static void main(String[] args){
        Addition a1 = new Addition();
                a1.display();
                c c =new c();
                c.fun(2);
        System.out.println("The value of a : "+ c.a);

    }
}


