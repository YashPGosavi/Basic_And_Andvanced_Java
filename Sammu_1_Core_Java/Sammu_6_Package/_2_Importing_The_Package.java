/*
\\*__*\\

Importing Package :-

1)All the standard classes in Java are stored in named packages.
2)There is no standard class present in Java which is unnamed.
  But it is always complicated to write the class name using a long sequence of packages containing dot operator.
  Hence, the import statement is needed.
3)The import statement can be written at the beginning of the Java program, using the keyword " import ".
 For example -
          import com.PPL_Unit_4._14_ObjectClass_toStingMethodOfObjectClass;
         or
          import com.PPL_Unit_4.*;
       -> Either a class name can be specified explicitly (or) a " * " can be used which indicated
          that the Java compiler should import the entire package.
       -> The " * " increases the compiler time, hence it is a good practice to use specific class wherever possible.
      ->  s = java.lang.String("Yash");  ---> Use without Importing Package.

\\*__*\\
IMPORTING CLASS FROM " _14_ObjectClass_toStingMethodOfObjectClass " THIS PROGRAM.
        1)We can add class to existing classes.
        2)We can import existing program by using package.

 */

package Sammu_1_Core_Java.Sammu_6_Package;
import java.lang.String;

public class _2_Importing_The_Package {
    public static void main(String[] args) {
        System.out.println();
    }
}


