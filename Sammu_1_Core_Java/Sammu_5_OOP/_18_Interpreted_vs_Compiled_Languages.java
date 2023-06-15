/*
    Interpreter vs Compiler

                    Interpreter                                             Compiler
1)   Interpreter translate ine statement                            Compiler scan entire program and translate whole
     machine code at a time into machine code.                      of it into machine code.

2)   Interpreter is needed everytime to execute the                 Once compiles then again it is not needed.
     code.

3)   Partial execution to the error.                                No execution if an error occurs.

4)   Usually easy for programmer.                                   Usually not easy as Interpreter Language.


 Que.So What is Java Interpreter Or Compiler language ?
-->  Java is hybrid language, The output of Java compiler is not executable code but it is a bytecode.
     The instructions of bytecode are executed by the Java Virtual Machine (JVM). That means
     JVM converts the bytecode to machine-readable form.

     Java file               --->                   Class file (Byte code)            --->
    (.java file)     ( Compiled using java c )          (.class file)         ( This can be used by JVM )

--> This becomes java platform independent.



 */

package Sammu_1_Core_Java.Sammu_5_OOP;

public class _18_Interpreted_vs_Compiled_Languages {
     public static void main(String[] args){
          System.out.println("Main Method");
     }
}

