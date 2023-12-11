package com.company;

public class MethodOverloading_13
{
    static void funct()
    {
        System.out.println("Default method invoked !");
    }

    static void funct(int a)
    {
        System.out.println("Single parameter method invoked !");
        System.out.println("The value of a is "+a);
    }

    static void funct(int a, int b)
    {
        System.out.println("Double parameter method invoked !");
        System.out.println("The value of a is "+a+" and b is "+b);
    }

    public static void main(String[] args)
    {
        funct();

        funct(2);

        funct(4, 6);
    }
}