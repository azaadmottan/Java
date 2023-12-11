package com.company;

class BaseConstructor
{
    public int a, b;
    public BaseConstructor()
    {
        System.out.println("\nBase Class Constructor !");
    }
    public BaseConstructor(int x, int y)                        // Parameterized constructor
    {
        this.a = x;
        this.b = y;
    }
    public void getDataBase()
    {
        System.out.println("\nThe value of a is "+a+" and the value of b is "+b);
    }
}

class DeriveConstructor extends BaseConstructor
{
    public int c, d;
    public DeriveConstructor()
    {
        // super();
        System.out.println("Derive Class Constructor !");
    }
    public DeriveConstructor(int p, int q, int r, int s)                // Parameterized constructor
    {
        super(r, s);                            // It is used to call the base class constructor !
        this.c = p;
        this.d = q;
    }
    public void getDataDerive()
    {
        System.out.println("The value of c is "+c+" and the value of d is "+d);
    }
}
public class Constructor_In_Inheritance_20
{
    public static void main(String[] args)
    {
        DeriveConstructor obj = new DeriveConstructor();

        DeriveConstructor obj1 = new DeriveConstructor(2, 4, 6, 8);

        obj1.getDataBase();
        obj1.getDataDerive();
    }
}