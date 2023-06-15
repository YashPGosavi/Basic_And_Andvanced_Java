package Sammu_1_Core_Java.Sammu_3_Method_Recursion;

public class _13_Argument_Passing {
    void val(int a, int b){
        a = a+5;
        b= b+5;

    }
    public static void main(String Args[]){
        _13_Argument_Passing A = new _13_Argument_Passing();
        int a,b;
        a=10;b=20;
        System.out.println("Before Function call value");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
        A.val(a,b);
        System.out.println("After Function call value");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);

    }
}


