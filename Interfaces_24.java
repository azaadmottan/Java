package com.company;

interface first_1
{
    final int id = 2240;            // By default data members are final means(we can't change the value of data member)
    void funct_1();
    void funct_2();
    private void function_2()
    {
        System.out.println("\nPrivate function in interface !");
    }
    default void function_1()
    {
        function_2();       // Private method can be called(invoked) using default method
        System.out.println("\nWe can define \"default\" method in interface\n");
    }
}
interface second_1
{
    int salary = 4460;
    void funct_3();
    void funct_4();
}

class firstInterface implements first_1, second_1
{
    public void funct_1()
    {
        System.out.println("First Interface class Method(funct_1) Invoked !");
    }
    public void funct_2()
    {
        System.out.println("First Interface class Method(funct_2) Invoked !");
    }
    public void funct_3()
    {
        System.out.println("Second Interface class Method(funct_3) Invoked !");
    }
    public void funct_4()
    {
        System.out.println("Second Interface class Method(funct_4) Invoked !");
    }
}
public class Interfaces_24
{
    public static void main(String[] args)
    {
        // first_1 obj = new first_1();  com.compeny.first_1 is abstract; cannot be instantiated
        // second_1 obj = new second_1();  com.compeny.second_1 is abstract; cannot be instantiated
        // obj.funct_1();

        firstInterface obj = new firstInterface();

        // obj.id = 123456;    // we can't change the properties of the interface in "main class or other class"

        // obj.function_2();    we can't call directly private member function of the class out side the class definition (Throws an error)
        obj.function_1();
        obj.funct_1();
        obj.funct_2();
        obj.funct_3();
        obj.funct_4();
    }
}