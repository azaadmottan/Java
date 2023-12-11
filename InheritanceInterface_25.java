package com.company;

interface inheritInterface_1
{
    void method_1();
}                       // An interface can contain method signatures (methods without a body), constants,
                        // and default methods (methods with a default implementation).
interface inheritInterface_2 extends inheritInterface_1
{                       // Interfaces can also be extended by other interfaces.
                        // A class that implements an interface can also implement multiple interfaces.
    void method_2();
}
class inheritInheritance implements inheritInterface_2
{
    public void method_1()
    {
        System.out.println("Interface Method-1 invoked !");
    }
    public void method_2()
    {
        System.out.println("Interface Method-2 invoked !");
    }
}
public class InheritanceInterface_25
{
    public static void main(String[] args)
    {
        inheritInheritance obj = new inheritInheritance();

        obj.method_1();
        obj.method_2();
    }
}