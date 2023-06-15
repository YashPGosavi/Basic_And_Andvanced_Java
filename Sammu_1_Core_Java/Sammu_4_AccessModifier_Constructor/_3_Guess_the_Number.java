/*
Create a class Game, which allows a user to play
"Guess the Number" game once.
 */

package Sammu_1_Core_Java.Sammu_4_AccessModifier_Constructor;

import java.util.Random;
import java.util.Scanner;

//class Game {
//    int a, i, x = 1;
//
//    public Game() {
//
//        Random No = new Random();
//        int a = No.nextInt(0,101);
//        this.a = a;
//    }
//    void userInput()
//    {
//        System.out.println("Choose The Number Between 1-100 : ");
//        do {
//            Scanner sc = new Scanner(System.in);
//            i = sc.nextInt();
//            if (i == a) {
//                System.out.println("You Guess The Right Number.\n The Number is  : "+a);
//                break;
//            } else if (i>100 || i<0) {
//                System.out.println("Choose The Number In Correct Range Of 1-100.");
//            } else if (i < a) {
//                System.out.print("Choose the Number Higher : ");
//            } else if (i > a) {
//                System.out.println("Choose the Number Lower : ");
//            }
//            x++;
//        } while (i != a);
//    }
//    void Attempt(){
//        System.out.println("You Attempt for "+ x +" Times.");
//    }
//
//}
//public class Sammu_20_Guess_the_Number {
//    public static void main(String[] args) {
//        Game g = new Game();
//        g.userInput();
//        g.Attempt();
//
//    }
//}

class Game {
    int number, UserInput, NumberOfGauesses = 0;

    Game() {
        Random ran = new Random();
        number = ran.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt();
    }

    boolean iscorrect() {
        NumberOfGauesses++;
        if (number == UserInput) {
            System.out.format("You gauss right number %d \n In the %d times", number, NumberOfGauesses);
        } else if (number > UserInput) {
            System.out.println("To low...");
        } else if (number < UserInput) {
            System.out.println("To high...");
        }
        return false;
    }
}
public class _3_Guess_the_Number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            g.iscorrect();
        }
    }
}