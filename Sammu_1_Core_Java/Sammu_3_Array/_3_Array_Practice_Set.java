package Sammu_1_Core_Java.Sammu_3_Array;

public class _3_Array_Practice_Set {
    public static void main(String[] args) {
        // Q.1
//        float arr[] = {12.1f, 12.2f, 12.3f, 12.4f, 12.5f};
//        //Method 1
////        float sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
////        System.out.println("The Sum Of Array is : " + sum);
//        //Method 2
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        float sum = 0;
//        for(float element : arr){
//            sum = sum+element;
//        }
//        System.out.println("Sum is : " + sum);
//
//        System.out.println("************************************************************");

        //Q.2
//        float arr[] = {12.1f, 12.2f, 12.3f, 12.4f, 12.5f};
//        System.out.println("Enter The No. That You want to search in array : ");
//        Scanner search = new Scanner(System.in);
//        Float find = search.nextFloat();

        //Method 1
//        for(float element : arr){
//            if(find==element){
//                System.out.println("This Number is Present in array");
//                break;
//            }
//            else{
//                System.out.println("This Number is Not-Present in array");
//        break;
//
//            }
//            }

        //Method 2
//        for (int i = 0; i < arr.length; i++) {
//            if (find == arr[i]) {
//                System.out.println(find + " : - This Number Is Present In Array At Index Of " + i);
//                break;
//            }
//            else {
//                System.out.println("This Number is Not-Present in array");
//                break;
//
//            }
//        }

        //Q.3
//        float arr[] = {12.0f, 13.0f, 14.0f, 15.0f, 16.0f};
//        float avg = 0;
//        for(float element : arr){
//            avg =  avg + element /  arr.length  ;
//        }
//        System.out.println("Average Marks is : " + avg);

//        Q.4
        int arr1 [][]={{1, 2, 3,},
                       {4, 5, 6}};

        int arr2[][]={{1, 2, 3,},
                      {4, 5, 6}};

        for (int i=0; i<arr1.length;i++){
            for(int j = 0; j< arr1[i].length;j++){
                System.out.print(arr1[i][j]+arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        //Q.5
//        int arr[] = {12, 13, 14, 15, 16};
//        int n = Math.floorDiv(arr.length, 2);
//        int temp;
//        for (int i = 0; i < n; i++) {
//            temp = arr[i];
//            arr[i] = arr[arr.length - i - 1]; // We done Swapping of element in memory location.
//            arr[arr.length - i - 1] = temp;
//        }
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }

            //Q.6
//        int arr[] = {12, 13, 14, 15, 16};
//
//        int max = 0;  // we can also use "Integer.Min_Value"/"Integer.Max_Value" for finding any no.
//        for(int i=0;i<arr.length;i++){
//            for(int e : arr){
//               if(e>max) {
//                   max = e;
//                   break;
//               }
//          }
//        }
//        System.out.println("The Maximum Number In Array is : " + max);

            //Q.7
//        int arr[] = {-12, 13, 14, 15, 16};
//        int min = Integer.MAX_VALUE;
//        for(int i=0 ; i< arr.length; i++){
//            for( int e : arr){
//                if(e<min){
//                min = e;
//                break;
//                }
//            }
//        }
//        System.out.println("The Minimum Number In Array is : " + min);

            //Q.8

            // |1| |2| |3|
            //  0   1   2
//        int arr[] = {12, 13, 14, 15, 16};
//        boolean Sorted = true;
//        for (int i=0; i < arr.length-1;i++){
//             if(arr[i] > arr[i+1]){
//                 Sorted = false;
//                }
//        }
//        if(Sorted){
//            System.out.println("Array is Sorted");
//        }
//        else{
//            System.out.println("Array is Unsorted");
//        }
        }
    }
