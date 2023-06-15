/*
Lambda expressions let us express instances of single method classes more compactly.
Anonymous classes are used to implement the base class without giving it a name.
For a class with single method, even anonymous get classes get slightly excessive and customer.
 */
package Sammu_3_Advanced_Java2;
interface I1{
    void meth1(int a);
}

public class _3_Anonymous_class_Lambda_Expression {
    public static void main(String[] args) {
       /*

       // Annunimous
        I1 obj = new I1(){

            @Override
            public void meth1() {
                System.out.println("Meth1");
            }

            @Override
            public void meth2() {
                System.out.println("Meth2");
            }
        };

        obj.meth1();
        */
       /*
        I1 obj = (a)->{
            System.out.println("Lambda Method : -" + a);
        };
        obj.meth1(3);
        */
    }
}
