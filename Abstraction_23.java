package com.company;

abstract class first_2
{
    int id = 220, salary = 440;
    abstract public void method_1();
    abstract public void method_2();
}
class second_2 extends first_2
{
    int c, d;
    void setData(int x, int y)
    {

        this.c = x;
        this.d = y;
    }
    void getData()
    {
        System.out.println("The value of c is "+c);
        System.out.println("The value of d is "+d);
    }

    @Override
    public void method_1()
    {
        System.out.println("The value of Id is "+id);
    }
    public void method_2()
    {
        System.out.println("The value of Salary is "+salary);
    }
}
    /*An abstract class in Java is a class that cannot be instantiated on its own, but can be subclassed. An abstract class can contain both abstract methods (methods without a body) and concrete methods (methods with a body). When a class is declared as abstract, it can provide a common interface and implementation that can be shared among its subclasses.*/
public class Abstraction_23
{
    public static void main(String[] args)
    {
        second_2 obj = new second_2();

        obj.setData(2, 4);
        obj.getData();
        obj.method_1();
        obj.method_2();
    }
}