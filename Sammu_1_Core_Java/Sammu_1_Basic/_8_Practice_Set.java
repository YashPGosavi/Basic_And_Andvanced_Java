package Sammu_1_Core_Java.Sammu_1_Basic;

import java.util.Random;
import java.util.Scanner;

public class _8_Practice_Set {
    public static void main(String[] args) {

        /*...*/ // Make A Program To Calculate Percentage Of A Student And Tell Them They Are Pass Or Fail.
//            Scanner pers = new Scanner(System.in);
//            System.out.println(" Enter Marks of Sub Math : ");
//            float math = pers.nextInt();
//            System.out.println(" Enter Marks of Sub Sci : ");
//            float Sci = pers.nextInt();
//            System.out.println(" Enter Marks of Sub Bio : ");
//            float Bio = pers.nextInt();
//            float Persentage = ((math + Sci +Bio)/3.0f );
//            System.out.println(" Percentage is  : " + Persentage %.2f+ "%");
//
//            if(Persentage<40){
//                System.out.println("Sorry! You are Fail...");
//            }
//            else if (Persentage<0){
//                System.out.println("Sorry! You are Fail...");
//            }
//            else{
//                System.out.println("Congratulations! You Are Pass.");
//            }
//

        /*...*/ // Make A Program To Calculte The Income Tax On Salery.
//        System.out.println("Enter Your Salery : ");
//        Scanner Salery = new Scanner(System.in);
//        int x = Salery.nextInt();
//        int a;
//        if(250000>=x && x>=500000){
//            a = (x/100) * (5);
//            System.out.println("You Have To Pay Income Tax Rs :- " + a);
//        }
//        else if(500000>=x && x>=100000){
//            a = (x/100) * (20);
//            System.out.println("You Have To Pay Income Tax Rs :- " + a);
//        }
//        else if (x>=1000000){
//            a = (x/100) * (30);
//            System.out.println("You Have To Pay Income Tax Rs :- " + a);
//        }
//        else{
//            System.out.println("You Don't Have Pay the Tax");
//        }


        /*...*/ // Mamke A Program To Find The Year Is Leap Or Not.
//        System.out.println("Enter the Year : - ");
//        Scanner year = new Scanner(System.in);
//        int leap_year = year.nextInt();
//        if(leap_year%4==0){
//            System.out.println("This is leap year.");
//        }
//        else{
//            System.out.println("This is not leap year.");
//        }


        /*...*/ // Make A Program To find Website Is Commercial Website or Organisation Website or Indian Website or Private Website.
//        System.out.println("Enter Website : ");
//        Scanner website = new Scanner(System.in);
//        String web = website.nextLine();
//        if(web.endsWith(".com")){
//            System.out.println("This is Commercial Website.");
//        }
//        else if(web.endsWith(".org")){
//            System.out.println("This is Organisation Website.");
//        }
//        else if(web.endsWith(".in")){
//            System.out.println("This is Indian Website.");
//        }
//        else{
//            System.out.println("This is Private Website");
//        }


        /*...*/ // Make The Rock, Paper, Scissor Game.
        int i=1;
        Game:
       do {

           //For User Choice
           System.out.println("Round "+ i);
            System.out.println("Enter Your Choise : \n1)Rock.\n2)Paper.\n3)Scissor");
            Scanner sc = new Scanner(System.in);
            int ply_choice = sc.nextInt();

           System.out.print("Your Choice is : " );
           switch (ply_choice) {

               case 1:
                   System.out.println("Rock");
                   break;

               case 2:
                   System.out.println("Paper");
                   break;

               case 3:
                   System.out.println("Scissor");
                   break;
           }

            if (ply_choice > 3) {

                System.out.println("Invalid Choise!");
                break Game;
            }

            // For Computer Choice
            Random game = new Random();
            int comp_choice = game.nextInt(1, 4);
            System.out.print("Computer Choice is : ");

            switch (comp_choice) {

                case 1:
                    System.out.println("Rock");
                    break;

                case 2:
                    System.out.println("Paper");
                    break;

                case 3:
                    System.out.println("Scissor");
                    break;
            }


           //Win Or Loss Condition
            if (ply_choice == comp_choice) {
                System.out.println("Draw!");
            }
            else if (ply_choice == 1 && comp_choice == 3 || ply_choice == 3 && comp_choice == 2 || ply_choice == 2 && comp_choice == 1) {
                System.out.println("You Win");
            }
            else {
                System.out.println("You Loss!");
            }

           System.out.println(" ");

            i++;
        }while(i<=3);


    }
}
