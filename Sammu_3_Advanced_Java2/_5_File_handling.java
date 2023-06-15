/*
Reading form and writing to file is an important aspect of any programing language.

We can use file class in java to create file object.

Methods
1)createNewFile() :- Create new file.

2)write() :- Write into the file.

3)For reading the file you have to create object of scanner class and supply in file object.
                Scanner sc = new Scanner(MyFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);

4)delete() :- Delete the file.
 */

package Sammu_3_Advanced_Java2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SecureCacheResponse;
import java.util.Scanner;

public class _5_File_handling {
    public static void main(String[] args) {


        /*
        //Create New File

        File MyFile = new File("MyFile.txt");
        try {
            MyFile.createNewFile();
        } catch (Exception e) {
            System.out.println("Unable to create file" + e);
        }
        */


       /*
        //Write to a file
        try {
            FileWriter MyFileWriter = new FileWriter("MyFile.txt");
            MyFileWriter.write("This is My File.\nBye...");
            MyFileWriter.close();  //If you open file then you need to close it
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        /*
        //Reading A file
        File MyFile = new File("MyFile.txt");
        try{
            Scanner sc = new Scanner(MyFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
         */

       /*
       //Deleting the file
        File MyFile = new File("MyFile.txt");
        if(MyFile.delete()){
            System.out.println("File is deleted "+MyFile);
        }
        else{
            System.out.println("Error Occurred");
        }
        */



        /*
        File file = new File("file");
        try{
        FileWriter f = new FileWriter("file");
        f.write("This is file for deleting purpose.\nOhk.");
        f.close();
    }
        catch(Exception e){
            System.out.println(e);
        }

        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String l = sc.nextLine();
                System.out.println(l);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }


        if(file.delete()){
            System.out.println("File is deleted "+file);
        }
        else{
            System.out.println("Error Occurred");
        }
         */
    }
}