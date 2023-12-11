package com.company;

import java.util.Scanner;
public class String_06
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        // Different ways to print string in java
        // System.out.print()
        // System.out.println()
        // System.out.printf()         {format-specifier: %d(int), %c(char), %f(float), %s(string)}
        // System.out.format()         {format-specifier: %d(int), %c(char), %f(float), %s(string)}

        System.out.print("Enter any string value: ");
        String str1 = cin.nextLine();

        System.out.println("\nString value: "+str1);

        System.out.print("\nEnter the value of a: ");
        int a = cin.nextInt();

        System.out.printf("\nValue of a: %d",a);

    }
}