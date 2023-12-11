package com.company;

class A
{
    public int a, b;
    public void setData(int x, int y)
    {
        this.a = x;
        this.b = y;
    }
    public void getData()
    {
        System.out.println("Base Class Method Invoked !");
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
}
class B extends A
{
    public int c, d;
    @Override
    public void setData(int x, int y)
    {
        this.c = x;
        this.d = y;
    }
    public void getData()
    {
        System.out.println("\nDerived Class Method Invoked !");
        System.out.println("The value of c is "+c+" and the value of d is "+d);
    }
}
    /*
        Method overriding is a feature in Java that allows a subclass to provide a new implementation for a method defined in its superclass. The overriding method must have the same name, return type, and parameters as the method in the superclass.

         The "@Override" annotation can be used to indicate that a method is meant to override a method in a superclass, although this is optional and the method will still override even if the annotation is not present.
    */
public class MethodOverriding_21
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setData(20, 80);
        obj1.getData();

        obj2.setData(40, 100);
        obj2.getData();
    }
}