package com.company;
import java.util.Scanner;
public class Switch_08
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.print("Press\n\t1. '+'\n\t2. '-'\n\t3. '*'\n\t4. '/'\n\t5. '%'\n\nEnter : ");
        String option = cin.next();

        System.out.print("\nEnter First Number: ");
        int num_1 = cin.nextInt();

        System.out.print("Enter Second Number: ");
        int num_2 = cin.nextInt();

        switch (option)
        {
            case "+"->
            {
                System.out.println("\nSum of "+num_1+" + "+num_2+" is "+(num_1+num_2));
            }

            case "-"->
            {
                System.out.println("\nSubtraction of "+num_1+" - "+num_2+" is "+(num_1-num_2));
            }
            case "*"->
            {
                System.out.println("\nMultiplication of "+num_1+" * "+num_2+" is "+(num_1*num_2));
            }

            case "/"->
            {
                System.out.println("\nDivision of "+num_1+" / "+num_2+" is "+((float)num_1/(float)num_2));
            }
            case "%"->
            {
                System.out.println("\nModulus of "+num_1+" % "+num_2+" is "+(num_1%num_2));
            }
            default ->
            {
                System.out.println("\nPlease Enter Valid Option !");
            }
        }
    }
}