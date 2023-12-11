package com.company;
import java.util.Scanner;
public class ConditionStatement_07_01
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = cin.nextInt();

        if (age >= 18)
        {
            System.out.println("Your age is greater than 18 !\n\tYou can derive.");
        }
        else if (age <= 0)
        {
            System.out.println("Please Enter valid age !");
        }
        else
        {
            System.out.println("Your age is less than 18 !\n\tYou can't derive.");
        }
    }
}