/*
\\*__*\\
1)Package is defined using a keyword package.
2)The syntax for declaring the package is :-
                 package_name_of_package;
3)This package is defined at the beginning of the program.
4)The package statement defines the name space in which the classes are stored.
5)If we omit the package then the default classes are put in the package that has no name.
6)Basically Java creates a directory and the name of this directory becomes the package name.
  For example - In your program, if you declare the package as -
                  package My_Package;
 here we must create the directory name My_Package in the current working directory
 and the required classes must be stored in that directory.
 Note that the name of the package and the name of the directory must be the same.
 This name is case-sensitive.
7)We can create hierarchy of packages. For instance if you save the required class files
 in the subfolder MyPkg3 and the path for this subfolder is -
                 C:\MyPkg1\MyPkg2\MyPkg3 then the declaration for the package in your java
 program will be -
                 package MyPkg1.MyPkg2.MyPkg3;
*/

 package Sammu_1_Core_Java.Sammu_6_Package;
import java.util.Scanner;
public class _1_Introduction_To_Package {
    public static void main(String[] args) {
        System.out.println("Enter No. as Scanner input");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Output of Scanner input is : " + a);
    }
}

