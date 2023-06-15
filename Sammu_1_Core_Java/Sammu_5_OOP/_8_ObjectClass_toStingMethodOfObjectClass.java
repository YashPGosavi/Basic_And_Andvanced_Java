package Sammu_1_Core_Java.Sammu_5_OOP;
/*
\\*__*\\
Object Class
1)In Java there is a special class named Object. If no inheritance is specified for the
  classes then all those classes are subclass of the Object class.
2)In other words, Object is a superclass of all other classes by default. Hence, it is

 *\*specified as -
 *\* public class A { ...} is equal to public class A extends Object {...}

3) The most commonly method of object class being used is toString() method. Let us
discuss these it with the help of example -

\\*__*\\
The to String Method of Object Class
1) The toString method returns the String type value. Hence, the signature (syntax) of this method is -
 *\* public String toString()

2)If we invoke the toString method, by default then it returns a string which describes the object.
  This returned string consists of the character " @ " and object's memory address in hexadecimal form.
  But we can override the toString method.
 */

class ToStr extends Object {
    String a = "Samiksha";
    @Override
    public String toString() {
        System.out.println(a);
        return super.toString();
    }
}

public class _8_ObjectClass_toStingMethodOfObjectClass {
    public static void main(String[] args){
        System.out.println("Yash");
//        ToSting t = new ToSting();  //We can't call to string like this.
//        t.toString();
        fun(new ToStr());
    }
    public static void fun (Object x){
        System.out.println(x.toString());
    }
}