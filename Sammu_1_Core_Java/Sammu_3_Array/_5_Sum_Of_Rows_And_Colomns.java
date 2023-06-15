package Sammu_1_Core_Java.Sammu_3_Array;

public class _5_Sum_Of_Rows_And_Colomns {
    public static void main(String[] args) {
        int a[][] = {{2, 3, 4,},
                {4, 5, 6,},
                {1, 2, 3}};
        for (int i = 0; i < a.length; i++) {
                int r_sum = 0;

                for (int j = 0; j < a[0].length; j++) {
                    {
                        r_sum = r_sum + a[i][j];
                    }
                }
                System.out.print("Sum Of Row "+(i+1)+ " : " +r_sum + " ");
                System.out.println("");
            }
        System.out.println("*****************************************");

        for (int i = 0; i < a[0].length; i++) {
            int c_sum = 0;

            for (int j = 0; j < a.length; j++) {
                {
                    c_sum = c_sum + a[j][i];
                }
            }
            System.out.print("Sum Of Col "+(i+1 )+ " : " + c_sum + " ");
            System.out.println("");
        }


        }
    }