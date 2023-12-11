package com.company;

import java.util.Scanner;
public class Practice_01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Marks of Subject-1: ");
        int marks_1 = input.nextInt();

        System.out.print("Enter Marks of Subject-2: ");
        int marks_2 = input.nextInt();

        System.out.print("Enter Marks of Subject-3: ");
        int marks_3 = input.nextInt();

        System.out.print("Enter Marks of Subject-4: ");
        int marks_4 = input.nextInt();

        System.out.print("Enter Marks of Subject-5: ");
        int marks_5 = input.nextInt();

        float percent = (float) ((marks_1 + marks_2 + marks_3 + marks_4 + marks_5) * 100) / 500;

        System.out.print("\nPercentage : "+percent+"%");
    }
}