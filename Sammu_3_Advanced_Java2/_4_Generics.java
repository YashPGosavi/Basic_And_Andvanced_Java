/*
Very Similar to C++ Templates (but not the Same)
If we write;
    ArrayList<Integer> a = new ArrayList<>();
    a.add(23);
 */
package Sammu_3_Advanced_Java2;

import javax.lang.model.element.Element;
import java.util.ArrayList;
class gen <T1,T2>{

    int val;
    private T1 t1;
    private T2 t2;

    gen(int val,T1 t1,T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }


    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

}
public class _4_Generics {
    public static  void main(String[] args) {
//        ArrayList <Integer>a = new ArrayList () ;
//        a.add(12);
//        a.add(4);
//        int b = (int) a.get(0);
//        System.out.println(b);

        gen <String,Integer>g1 = new gen(12,"Yash",13);
      String str = g1.getT1();
        System.out.println(str);

        Integer int1= g1.getT2();
        System.out.println(int1);
    }
}
