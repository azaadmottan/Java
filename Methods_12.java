package com.company;
import java.util.Scanner;

public class Methods_12
{
    static int fact(int n)
    {
        int ans = 1;
        for (int i = 1; i <= n; i++)
        {
            ans *= i;
        }

        return ans;
    }

    int sum(int x, int y)
    {
        return x + y;
    }

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        // Methods(Functions)
        // static return_type function_name(parameter_list){Body of function}

        // function call(invoke)
        // static function can be invoked directly
        // if "static" is not present using "object" of the class(can be invoked).
        // create object
        // class_name object = new class_name(parameters);
        // object.function_name();

        System.out.print("Enter any integer: ");
        int num = cin.nextInt();

        int ans = fact(num);
        System.out.println("The factorial of "+num+" is "+ans);

        System.out.print("Enter First number : ");
        int num_1 = cin.nextInt();

        System.out.print("Enter Second number : ");
        int num_2 = cin.nextInt();

        Methods_12 obj = new Methods_12();

        int ans_2 = obj.sum(num_1, num_2);
        System.out.println("The Sum of "+num_1+" and "+num_2+" is "+ans_2);

    }
}