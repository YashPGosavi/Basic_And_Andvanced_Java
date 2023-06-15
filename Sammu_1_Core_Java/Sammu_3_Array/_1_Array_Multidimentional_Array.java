package Sammu_1_Core_Java.Sammu_3_Array;

import java.util.Scanner;

public class _1_Array_Multidimentional_Array {
    public static void main(String[] args) {

        /*...*/ // Declaration Of Array.
//        int [] i = new int [3];
//        i[0]=1;
//        i[1]=2;
//        i[2]=3;
//        System.out.println(i[0]);

        /*...*/ //Printing An Array.
//        int arr[] = {12, 13, 14, 15, 16};
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + "  ");
//        }


//        System.out.println("Enter Array Size : ");
//        Scanner arr1 = new Scanner(System.in);
//        int n = arr1.nextInt();
//        int marks []= new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter Marks : ");
//            marks[i] = arr1.nextInt();   //Read the array.
//        }
//            for (int mark : marks) {
//                System.out.print( mark + " ");
//            }


        System.out.println("Enter Number OF Employee : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String Name[] = new String[a];
        int Id[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter Name OF Employee : ");
            Name[i] = sc.next();
            System.out.println("Enter Id : ");
            Id[i] = sc.nextInt();
        }
            for (int i = 0; i < a; i++) {
                System.out.print((i + 1) + "\t\t\t" + Name[i] + "\t\t" + Id[i]);
                System.out.println(" ");
        }




//            for (String Nam : Name) {
//                System.out.print(Nam + "\t");
//            }
//            for (int id : Id) {
//                System.out.print(id + "\n");
//            }



//            int[] Array = {11, 12, 13, 14, 15};
//            System.out.println("Array length is :- " + Array.length);
//            System.out.println("Array in Order :- ");
//            for (int j = 0; j < Array.length; j++) {
//                System.out.println(Array[j]);
//            }
//
//
//            System.out.println("Array in Reversal Order :- ");
//            for (int k = Array.length - 1; k >= 0; k--) {
//                System.out.println(Array[k]);
//                System.out.println("Array in For-each loop");
//                System.out.println(Array.length);
//                for (int element : Array) {
//                    System.out.println(element);
//                }
//}

        /*__*/
        //Multidimensional Array
//        int [][] array= new int [2][2];
//        array [0][0]=101;
//        array [0][1]=102;
//        array [1][0]=201;
//        array [1][1]=202;
//        for(int i=0 ; i<array.length ; i++){
//            for(int j=0; j<array[i].length; j++){
//                System.out.print(array[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }


    }
}