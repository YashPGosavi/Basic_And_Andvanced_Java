package Sammu_2_Advanced_Java;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class _1_Practice_set_Advanced_Java {
        public static <Hashset> void main(String[] args) {
        /*
        //Q.1 Create an Array List and store name of 10 student inside it print it using for-each loop;
        ArrayList <String> student = new <String> ArrayList();
        student.add("Yash");
        student.add("Samiksha");
        student.add("Snehal");
        student.add("Abhishek");
        student.add("Shrikant");
        student.add("Ridhi");
        student.add("Prerna");
        student.add("Rida");
        student.add("Rehan");
        student.add("Sadaanand");
        student.add("Abhinandan");
        for(String o : student){
            System.out.println(o);
        }
        */

        /*
        //Q.2 Create a set in java Try to store duplicate element in this set and verify that only one instance is store.
                HashSet <Integer> set = new HashSet<>();
                set.add(2);
                set.add(3);
                set.add(4);
                set.add(5);
                set.add(2);
                for(int i : set){
                        System.out.print(i+ " ");
                }
                */

                //Q.3 Use Date class to print following format.
                //23:10:42

                Date d = new Date();
                System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

                //Q.4-5 Repeat 3 Using calendar class java.time API

                Calendar c = Calendar.getInstance();
                System.out.println(c.getTime().getHours()+":"+ c.getTime().getMinutes()+":"+c.getTime().getSeconds());

                LocalTime lt = LocalTime.now();
                DateTimeFormatter dt= DateTimeFormatter.ofPattern("H:m:s");
                String t = dt.format(lt);
                System.out.println(t);
        }
}

