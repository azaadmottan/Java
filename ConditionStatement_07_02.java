package com.company;
import java.util.Scanner;

public class ConditionStatement_07_02
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = cin.nextInt();

        if (number % 2 == 0 && number > 0)
        {
            System.out.printf("%d is Positive Even Number !",number);
        }
        else if (number <= 0)
        {
            System.out.printf("%d is not valid number",number);
        }
        else
        {
            System.out.printf("%d is Positive Odd Number !",number);
        }
    }
}