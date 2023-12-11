package com.company;

public class Recursion_15
{
    static int fact(int n)
    {
        if (n <= 0)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args)
    {
        int num = 4;

        System.out.println("The factorial of 4 is : "+fact(num));
    }
}