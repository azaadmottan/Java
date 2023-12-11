package com.company;

public class VariableArguments_14
{
    static int varargs(int ...arr)
    {
        int result = 0;

        for (int element : arr)
        {
            result += element;
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("The sum of 2, 4, 6 and 8 is "+varargs(2, 4, 6, 8));

        System.out.println("The sum of 1, 3, 5, 7, 9 and 11 is "+varargs(1, 3, 5, 7, 9, 11));

        System.out.println("The sum of 2 and 3 is "+varargs(2, 3));


    }
}