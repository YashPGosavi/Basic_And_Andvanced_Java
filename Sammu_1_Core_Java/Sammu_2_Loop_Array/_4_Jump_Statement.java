package Sammu_1_Core_Java.Sammu_2_Loop_Array;

public class _4_Jump_Statement {
    public static void main(String[] args) {

        /*...*/ // break.
//        for (int i = 5; i >= 0; i--) {
//
//            if (i == 2) {
//                System.out.println("Break");
//                break;
//            }
//            System.out.println(i);
//            System.out.println("Wait Until get break");
//        }
//    }


    /*...*/ // continue.
//    for (int i = 5; i >= 0; i--) {
//        if (i == 2) {
//            System.out.println("continue");
//            continue;
//        }
//        System.out.println(i);
//        System.out.println("Wait Until get continue");


      l1:  for (int i = 5; i >= 0; i--) {
            if (i == 2) {
                System.out.println("continue");
                continue l1;
            }
            System.out.println(i);
            System.out.println("Wait Until get continue");

        }

    }
}

