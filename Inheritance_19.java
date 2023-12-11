package com.company;

class Base
{
    int a;                                  // By default data members are public in java
    float b;                                // By default data members are public in java

    public void baseFunction()
    {
        System.out.println("\nBase Class Function Invoked !");
    }
    public void setDataBase(int x, float y)
    {
        this.a = x;
        this.b = y;
    }

    public void getDataBase()
    {
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
}

class Derive extends Base                       // "Derive" class is Extends[inherit(derived)] from "Base" class
{
    int c;
    float d;

    public void deriveFunction()
    {
        System.out.println("\nDerived Class function Invoked !");
    }

    public void setDataDerive(int p, float q)
    {
        this.c = p;
        this.d = q;
    }
    public void getDataDerive()
    {
        System.out.println("The value of c is "+c+" and the value of d is "+d);
    }
}

public class Inheritance_19
{
    public static void main(String[] args)
    {
        Derive obj = new Derive();

        obj.baseFunction();
        obj.setDataBase(20, 20.46f);
        obj.getDataBase();

        obj.deriveFunction();
        obj.setDataDerive(40, 40.56f);
        obj.getDataDerive();
    }
}