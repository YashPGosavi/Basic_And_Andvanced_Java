/*
Nested package is one package inside another package.
for example -
        package com.PPL_Unit_4._4_Nested_Package;
Note : - class, and method defines in package must be public.
 */
package Sammu_1_Core_Java.Sammu_6_Package.Nested_Package_1.Nested_Package_2;

import Sammu_1_Core_Java.Sammu_6_Package.Nested_Package_1.Nested_Package_class_2;
import Sammu_1_Core_Java.Sammu_6_Package._4_Nested_Package_class1;
public class Nested_Package_class_3 {
    public static void main(String[] args) {
        _4_Nested_Package_class1 a = new _4_Nested_Package_class1();
        a.set_val(4);
        a.get_val();
        Nested_Package_class_2 b = new Nested_Package_class_2();
        b.show();
        System.out.println("The Nested class example ->com._Sammu_39_Package.Nested_Package_1.Nested_Package_class_2.Nested_Package_class_3");

    }
}