/*
/**
 * Q.1 Create a javadoc
 * @author Yash
 * @version 2
 * @since 2002


package Sammu_3_Advanced_Java2;

// Q.2 create a class and add a method with deprecate annotation.
// Q.3 Suppress the generated warnings from 2
//Q.4 Create an interface and generate an instance of it
//it
class Q2 {
    @Deprecated
    void add5(int a){
        System.out.println(a+5);
    }
}

interface Q4 {
    void call();
}
public class _6_Advanced_Java_Practice_set {
    //
    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
//        Q2 q = new Q2();
//        q.add5(2);

        Q4 q = ()->{
                System.out.println("Q.4 Completed ");
        };
        q.call();
    }
}
*/

package Sammu_3_Advanced_Java2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _6_Advanced_Java_Practice_set {
    public static void main(String[] args) {
        int i = 19;
        String table = "";
        for (int j = 1; j < 11; j++) {
            table += j + "]" + i + "*" + j + "= " + j * i;
            table += "\n";
        }

        File Q5 = new File("Advanced_java_PRQ5.txt");
        try {
            FileWriter Q = new FileWriter("Advanced_java_PRQ5.txt");
            Q.write(table);
            Q.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}