package com.company;

public class Loop_09
{
    public static void main(String[] args)
    {
        System.out.println("While Loop");
        int a = 1;

        while(a <= 5)
        {
            System.out.print(a+" ");
            a++;
        }

        System.out.println("\n\nDo-while Loop");

        int b = 1;

        do
        {
            System.out.print(b+" ");
            b++;
        }while(b <= 5);

        System.out.println("\n\nFor Loop");

        for (int i = 1; i <= 5; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n\nFirst 10 Even Numbers: ");

        for (int i = 0; i <= 10; i++)
        {
            System.out.print((2*i) + " ");
        }
    }
}