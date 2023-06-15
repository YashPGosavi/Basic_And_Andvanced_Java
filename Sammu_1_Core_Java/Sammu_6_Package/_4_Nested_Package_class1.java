/*
Nested package is one package inside another package.
for example -
        package com._Sammu_39_Package._4_Nested_Package;
Note : - class, and method defines in package must be public.
 */
package Sammu_1_Core_Java.Sammu_6_Package;
public class _4_Nested_Package_class1 {
    int a;
    public void set_val(int n){
        a = n;
    }
    public void get_val(){
        System.out.println("The Nested class example -> com.PPL_Unit_4");
        System.out.println("The value is : "+a);
    }
}
