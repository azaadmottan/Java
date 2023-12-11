package com.company;

class Base_1
{
    public void method_1()
    {
        System.out.println("Base class Method-1 invoked");
    }
    public void method_2()
    {
        System.out.println("Base class Method-2 invoked");
    }
}
class Derive_1 extends Base_1
{
    public void method_3()
    {
        System.out.println("Derived class Method-3 invoked");
    }
    @Override
    public void method_2()
    {
        System.out.println("Derived class Method-4 invoked");
    }
}
public class DynamicMethodDispatch_22
{
    public static void main(String[] args)
    {
        Base_1 obj = new Derive_1();        // If we create reference of super(base) class and
                                            // object of sub(derive) class then the override function invoked must be derived class

        obj.method_1();
        obj.method_2();

        // obj.method_3();               // Throws an Error
        // obj.method_4();               // Throws an Error

        Base_1 obj1 = new Base_1();
        Derive_1 obj2 = new Derive_1();

        obj2.method_3();
        obj1.method_2();

    }
}