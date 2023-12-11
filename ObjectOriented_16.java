package com.company;
import java.util.Scanner;
class OOPs
{
    Scanner cin = new Scanner(System.in);
    int id;                             // Class attribute
    String name;                        // Class attribute
    int salary;                         // Class attribute
    public void getData()               // class method
    {
        System.out.print("Enter Your Id: ");
        id = cin.nextInt();

        name = cin.nextLine();              // It is used to "ignore" the input for next line
        System.out.print("Enter Your Name: ");
        name = cin.nextLine();

        System.out.print("Enter Your Salary: ");
        salary = cin.nextInt();
    }
    public void putData()
    {
        System.out.println("\nYour Id: "+id);

        System.out.println("Your Name: "+name);

        System.out.println("Your Salary: "+salary);
    }
}
public class ObjectOriented_16
{
    public static void main(String[] args)
    {
        OOPs obj = new OOPs();          // Create Object of class (ObjectOriented_16)

        obj.getData();                  // Using Object of class invoke(call) the method of class

        obj.putData();
    }
}