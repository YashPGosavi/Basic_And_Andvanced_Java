/*
You have to implement a library using Java Class Library
// Methods: issueBook, returnBook,
// Properties: Array to store the available books,
// array to store the issued books
 */
package Sammu_1_Core_Java.Sammu_5_OOP;

import java.util.Scanner;

class Library {

    String [] Books;
    String [] issuedBook;
    int NoOfBooks;
    Scanner sc = new Scanner(System.in);
    Library(){
        this.Books=new String[5];
        this.NoOfBooks=0;
    }
    void addBook(String book) {
        if(NoOfBooks>100){
            System.out.println("Space is not Available");
        }
        this.Books [NoOfBooks++]= book;
        System.out.println(book + ": This book has been added!");
    }
    void show(){
        int i =0;
        System.out.println("Available Books Are : ");
        for(String b : this.Books){
            if(b==null){
                continue;
            }
            else{
                System.out.println((i+1) + "] "+b);
                i++;
            }
        }
    }
    void issueBook(String book) {
        for(int i = 0; i<this.Books.length; i++){
            if(book.equals(this.Books[i])){
                System.out.println("The Book Has Been Issued");
                this.Books[i] = null;
                return;
            }
            else{
                System.out.println("This Book is Not Present");
                break;
            }
        }
    }

    void returnBook(String book) {
        addBook(book);
    }
}
public class _10_implement_library_using_java {
    public static void main(String[] args) {
        Library l = new Library();
        int ch;
        Scanner sc = new Scanner(System.in);
        String ans= null;
        do {
            System.out.println("   1. Add The Book \n   2. Issue the Book \n   3. Return the Book \n   4. See available Books \n   5. Exit ");
            System.out.println("Enter Your Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Book Name : ");
                    String book = sc.next();
                    l.addBook(book);
                    break;
                case 2:
                    System.out.print("Book Name : ");
                    String issueBook = sc.next();
                    l.issueBook(issueBook);
                    break;
                case 3:
                    System.out.println("Book Name");
                    String Return = sc.next();
                    l.returnBook(Return);
                case 4:
                    l.show();
                    break;
                case 5 :


            }
            if(ch<5) {
                System.out.println("\n\t..... Do You Want to Continue in Main Menu:y/n ");
                ans = sc.next();
            }
            else{
                System.out.println("\n\t...Thank You For Visiting Library!");
            }
        }while ( ch<5 || (ans == "y"|| ans=="Y"));
    }
}
//
//class Library{
//    Scanner sc = new Scanner(System.in);
//    String avBook[] = new String[10];
//    //    String isBook[] = new String[10];
//    int n;     // number of books
//
//    Library(){
//        avBook[0]="A";
//        avBook[1]="B";
//        avBook[2]="C";
//        avBook[3]="D";
//        n=4;
//    }
//
//    public void addBook(){
//        if(n>10){
//            System.out.println("Space is not Available to add the Book");
//        }
//            System.out.println("Enter name of the Book");
//            avBook[n]= sc.next();
//            n++;
//            System.out.println("You added book Successfully");
//    }
//
//    public void issueBook(){
//        System.out.println("Enter the name of the Book");
//        String s = sc.next();
//        for(int i = 0; i < n ; i++){
//            if(s.equalsIgnoreCase(avBook[i])){
//                System.out.println("Book is Available");
//                avBook[i]=null;
//            }
//            else {
//                System.out.println("Book is not Available");
//            }
//            break;
//        }
//    }
//
//    public void returnBook(){
//        System.out.println("Enter the name of the Book you have return ");
//        avBook[n]= sc.next();
//        n++;
//        System.out.println("You return book Successfully");
//    }
//
//    public void avlBooks() {
//        System.out.println("Available Books are:");
//        int i=0;
//        for(String book : avBook) {
//            if (book == null) {
//                continue;
//            }
//            else {
//                System.out.println((i+1) + "] " +book);
//                i++;
//            }
//
//        }
//    }
//}
//
//public class _10_implement_library_using_java {
//    public static void main(String[] args) {
//        Library MiniLibrary = new Library();
//        int ch;
//        Scanner s = new Scanner(System.in);
//        String ans;
//        do {
//            System.out.println("   1. Add The Book \n   2. Issue the Book \n   3. Return the Book \n   4. See available Books ");
//            System.out.println("Enter Your Choice: ");
//            Scanner a = new Scanner(System.in);
//            ch = a.nextInt();
//
//
//            switch (ch) {
//                case 1:
//                    MiniLibrary.addBook();
//                    break;
//                case 2:
//                    MiniLibrary.issueBook();
//                    break;
//                case 3:
//                    MiniLibrary.returnBook();
//                    break;
//                case 4:
//                    MiniLibrary.avlBooks();
//                    break;
//            }
//            System.out.println("\n\t..... Do You Want to Continue in Main Menu:y/n ");
//            ans = s.next();
//        }while (ch!=5 || (ans == "y"  || ans == "Y"));
//    }
//}