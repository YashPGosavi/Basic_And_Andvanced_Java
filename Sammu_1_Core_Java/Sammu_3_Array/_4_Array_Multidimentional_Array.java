package Sammu_1_Core_Java.Sammu_3_Array;

public class _4_Array_Multidimentional_Array {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println("");
        System.out.println("********************************************");

        int arr1[][]= {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int arr2[][]={{9,8,7},
                {6,5,4},
                {3,2,1}
        };
        int c[][] = new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                c[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println(" ");
        }

        System.out.println("********************************************");

        for( int i =0;i<arr1.length;i++){
            for(int j =0;j<arr1.length;j++) {
                if (i == j) {
                    c[i][j] = 0;
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }


        System.out.println("********************************************");

        int arr3[][]={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i = 0; i < arr3.length; i++) {
            int row_sum = 0;
            int col_sum = 0;
            for (int j = 0; j < arr3[0].length; j++) {
                row_sum = row_sum + arr3[i][j];
                col_sum = col_sum + arr3[j][i];
            }
            System.out.print("sum of Row  " + (i + 1) + " : " + row_sum + " \t\t");
            System.out.println("sum of col  " + (i + 1) + " : " + col_sum + " ");
        }
    }
}