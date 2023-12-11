package com.company;

public class MultidimensionalArrays_11
{
    public static void main(String[] args)
    {
        // Multidimensional arrays
        // int [][]arr = new int[rows][columns];

        // int [][]arr = new int[3][3];

        //         column[0]    column[0]   column[0]
        // row[0]   (0, 0)        (0, 1)      (0, 2)
        // row[1]   (1, 0)        (1, 1)      (1, 2)
        // row[1]   (2, 0)        (2, 1)      (2, 2)

        int [][]arr = new int[3][3];

        System.out.println("Multidimensional array: ");
        for (int i = 0; i < 3; i ++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("("+i+", "+j+")"+"\t");
            }
            System.out.println();
        }

        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[0][2] = 300;
        arr[1][0] = 400;
        arr[1][1] = 500;
        arr[1][2] = 600;
        arr[2][0] = 700;
        arr[2][1] = 800;
        arr[2][2] = 900;

        System.out.println("\nArray elements: ");
        for (int i = 0; i < 3; i ++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}