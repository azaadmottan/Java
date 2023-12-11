package com.company;
import java.util.Scanner;

public class exceptionHandling26
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        // final String os = System.getProperty("os.name");
        // Runtime.getRuntime().exec("cls");

        while (true)
        {
            System.out.print("Press\n\t1. '+'\n\t2. '-'\n\t3. '*'\n\t4. '/'\n\t5. '%'\n\nEnter : ");
            String option = cin.next();


            System.out.print("\nEnter First Number: ");
            int num_1 = cin.nextInt();

            System.out.print("Enter Second Number: ");
            int num_2 = cin.nextInt();

            switch (option)
            {
                case "+" -> {
                    System.out.println("\nSum of " + num_1 + " + " + num_2 + " is " + (num_1 + num_2));
                }

                case "-" -> {
                    System.out.println("\nSubtraction of " + num_1 + " - " + num_2 + " is " + (num_1 - num_2));
                }
                case "*" -> {
                    System.out.println("\nMultiplication of " + num_1 + " * " + num_2 + " is " + (num_1 * num_2));
                }

                case "/" -> {
                    try {
                        int div_1 = num_1 / num_2;      // This line is used to check the denominator

                        float div = ((float) num_1 / (float) num_2);
                        System.out.println("\nDivision of " + num_1 + " / " + num_2 + " is " + div );
                    } catch (Exception e) {
                        System.out.println("\n*****    Exception Occur !    *****\n\nReason: " + e);
                    }
                }
                case "%" -> {
                    System.out.println("\nModulus of " + num_1 + " % " + num_2 + " is " + (num_1 % num_2));
                }
                default -> {
                    System.out.println("\nPlease Enter Valid Option !");
                }
            }

            System.out.print("\nDo you want again calculate !\n(Enter Y/N): ");
            char str = cin.next().charAt(0);

            if (str == 'Y' || str == 'y')
            {
                break;
            }
        }
    }
}