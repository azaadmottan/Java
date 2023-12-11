package com.company;

import java.util.Scanner;
public class Input_03
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String str = cin.nextLine();

        System.out.print("Enter Your Roll number: ");
        int roll = cin.nextInt();

        System.out.print("Enter Your 10th %: ");
        float percent_10 = cin.nextFloat();

        System.out.print("Enter Your 12th %: ");
        float percent_12 = cin.nextFloat();

        System.out.println("\nName: "+str);
        System.out.println("Roll number: "+roll);
        System.out.println("10th Percentage: "+percent_10+"%");
        System.out.println("12th Percentage: "+percent_12+"%");

    }
}