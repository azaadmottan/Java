package com.company;

public class Arrays_10
{
    public static void main(String[] args)
    {
        // There are three ways to declare an array in java
        // 1. int []arr = new int[size_of_array];
        // 2. int []arr;
        //    arr = new int[size_of_array];
        // 3. int []arr = {10, 20, 30, 40, 50};

        int []arr = new int[6];             // Declaration of an array

        arr[0] = 10;
        arr[1] = 20;                        // Initialisation of an array
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

        System.out.println(arr[0]);         // Accessing of an array element
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        System.out.println("\nArray Length: "+arr.length);

        // Print array elements using loop
        System.out.println("\nPrint array element using for-loop: ");
        for (int i = 0; i < arr.length; i++)
        {
        System.out.println(arr[i]);
        }
        // Print array element using for-each loop
        System.out.println("\nPrint array elements using for-each loop : ");
        for (int element : arr)
        {
            System.out.println(element);
        }
    }
}