/*
ANNOTATIION :-
       It is used to provide extra information about the class,
       Annotation provides metadata to class/method
 */

package Sammu_3_Advanced_Java2;

class phone{
    void Phone_call(){
        System.out.println("I am Calling");
    }

    @Deprecated
    void sum(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
}

class call extends phone{
    @Override
    void Phone_call(){
        System.out.println("Ringing");
    }
}
public class _2_Annotation {
    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
     phone c =  new call();
     c.Phone_call();

     phone s =  new phone();
     c.sum(1,2);

    }
}
