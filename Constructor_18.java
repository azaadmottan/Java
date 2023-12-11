package com.company;

class First
{
    private int id;
    private int salary;
    public First()                          // Constructor Overloading
    {                                       // Default Constructor
        id = 21073;
        salary = 400000;
    }
    public First(int i, int s)              // Constructor Overloading
    {                                       // Parameterized Constructor
        id = i;
        salary = s;
    }
    public int getId()
    {
        return id;
    }
    public int getSalary()
    {
        return salary;
    }
}

public class Constructor_18
{
    public static void main(String[] args)
    {
        First obj = new First();
                    // constructor invoked at the time of object creation(run-time)

        System.out.println("Id : "+obj.getId());
        System.out.println("Salary : "+obj.getSalary());

        First obj2 = new First(21072, 600000);

        System.out.println("\nId : "+obj2.getId());
        System.out.println("Salary : "+obj2.getSalary());
    }
}