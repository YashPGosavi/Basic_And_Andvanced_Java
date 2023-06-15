package Sammu_1_Core_Java.Sammu_2_Loop_Array;

public class _2_break_continue {
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

       /*...*/ //lebele break.
//        loop:
//        for (int i = 5; i >= 0; i--) {
//
//            if (i == 2) {
//                System.out.println("Break");
//                break loop;
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

            //lebel continue
      loop:  for (int i = 5; i >= 0; i--) {
            if (i == 2) {
                System.out.println("continue");
                continue loop;
            }
            System.out.println(i);
            System.out.println("Wait Until get continue");

        }

    }
}

