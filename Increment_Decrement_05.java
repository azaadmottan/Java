package com.company;
public class Increment_Decrement_05
{
    public static void main(String[] args)
    {
        // Increment Operator & Decrement Operator
        int x = 10, y = 20;

        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);

        x++;
        System.out.println("\nThe value of x after increment is "+x);

        y++;
        System.out.println("The value of y after increment is "+y);

        System.out.println("\nThe value of x (post-increment) is "+(x++));
        System.out.println("The value of y (post-increment) is "+(y++));

        System.out.println("\nThe value of x (pre-increment) is "+(++x));
        System.out.println("The value of x (pre-increment) is "+(++y));

        char p = 'A';
        System.out.println("\nCharacter Increment\n");
        System.out.println("The value of p before increment: "+p);
        p++;
        System.out.println("The value of p after increment: "+p);
    }
}