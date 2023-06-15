/*
Que :- Create a library management system who issued books to student.
       1.Book Name
       2.Book Author
       3.Issued to
       4.Issued On
       User should be able to add books, return issued book, issue book.
       Assume all the user are register with their name in central database.

 */
package Sammu_2_Advanced_Java;

import javax.lang.model.element.Element;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Library{
    ArrayList<String> Books = new ArrayList<>();
    ArrayList<String> Stu_Name = new ArrayList<>();
    ArrayList<String> Issued_Books = new ArrayList<>();
    ArrayList<String> Authors = new ArrayList<>();
    LocalDate d = LocalDate.now();
    ArrayList<LocalDate> date = new ArrayList<>();

    Library(){
        this.Books.add(0,"BhagvatGita");
        this.Authors.add(0,"BhagvanShriKrushna");
        this.Books.add(1,"Ramayan");
        this.Authors.add(1,"Valmiki Rushi");
        this.Books.add(2,"Mahabharat");
        this.Authors.add(2,"Ved Vyass");
    }

    public void AddBook(String Book,String Author){
        int ib=3;
        int ia=3;
        this.Books.add(ib++,Book);
        this.Authors.add(ia++,Author);
        System.out.println(" "+Book+" Book is added in Library.\n Author Of "+Book+" is "+Author);
    }

    public void Issued(String Book,String Name){
        for(int i=0;i<this.Books.size();i++){
            if(this.Books.contains(Book)){
                this.Stu_Name.add(i,Name);
                this.Issued_Books.add(Book);
                this.Books.remove(Book);
                this.date.add(d);
                System.out.println(Book+ " -- Book is Issued To :- "+ Name + " On :- "+date);
                break;
            }
            else{
                System.out.println("Book is Not Present in Library");
                break;
            }
        }
    }

    void showAvailableBooks(){
        System.out.println("Available Books Are : ");
        System.out.println("Book\t\t\t\tAuthor");
        for(int i=0;i<this.Books.size();i++){
            if(this.Books.contains(null)){
                System.out.println("No Book is present");
                continue;
            }
            else{
                System.out.println((i+1) + "] "+this.Books.get(i)+" \t\t\t\t"+this.Authors.get(i));
            }
        }
    }

    void showIssuedBooks(){
         int i=0;
        do{
            if(this.Issued_Books.isEmpty()){
                System.out.println("No Book is Issued");
            }
            else{
                System.out.println("Issued Books Are : ");
                System.out.println("Book\t\t\t\tStudent Name\t\t\t\tIssued Date");
                System.out.println((i+1) + "] "+this.Issued_Books.get(i)+"\t\t\t\t"+this.Stu_Name.get(i)+"\t\t\t\t"+this.date.get(i));
                i++;
            }

        }while(i<this.Issued_Books.size());
    }

    void returnBooks(String Book){
        int i=0;
          do {
              i++;
              if (this.Issued_Books.contains(Book)) {
                  this.Books.add(Book);
                  this.Issued_Books.remove(Book);
                  System.out.println(Book + " This Book is Return.");

              } else {
                  System.out.println("Book Is Not Has Been Issued!");
              }
        }while (i<this.Issued_Books.size());
    }
}
public class _2_Exercise_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        int i=0;
        int ch;
        String ans = null;
         Lib : do{
            System.out.println("   1. Add The Book \n   2. Issue the Book \n   3. See available Books \n   4. See Issued Books  \n   5. Return the Book \n   6. Exit ");
            System.out.println("Enter Your Choice: ");
             ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Book Name : ");
                    String Book = sc.next();
                    System.out.println("Author Name : ");
                    String Author = sc.next();
                    l.AddBook(Book,Author);
                    break;
                case 2:
                    System.out.print("Book Name : ");
                    String issueBook = sc.next();
                    System.out.print("Student Name : ");
                    String Name = sc.next();
                    l.Issued(issueBook,Name);
                    break;

                case 3:
                    l.showAvailableBooks();
                    break;

                case 4:
                    l.showIssuedBooks();
                     break;

                case 5:
                    System.out.print("Book Name : ");
                    String returnBook = sc.next();
                    l.returnBooks(returnBook);
                    break;

                case 6:
                    System.out.println("Thank You For Visiting Library!");
                    break Lib;
            }
            if(ch<6) {
                System.out.println("\n\t..... Do You Want to Continue in Main Menu:y/n ");
                ans = sc.next();
            }
            else{
                System.out.println("\n\t...Thank You For Visiting Library!");
                break Lib;
            }
        }while(i<6|| (ans == "y"|| ans=="Y"));
    }
}
