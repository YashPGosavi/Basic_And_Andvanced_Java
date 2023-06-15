package Sammu_1_Core_Java.Sammu_3_Method_Recursion;

public class _14_Returning_Object {
    int a;
     _14_Returning_Object(int val) {
        a = val;
    }
     _14_Returning_Object fun(){
        _14_Returning_Object temp = new _14_Returning_Object(a+5);
        return temp;
    }
    public static void main(String args[]){
         _14_Returning_Object a = new _14_Returning_Object(20);
         _14_Returning_Object b;
          b = a.fun();
        System.out.println(b.a);
    }
}