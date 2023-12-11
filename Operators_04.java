package com.company;
public class Operators_04
{
    public static void main(String[] args)
    {
        int a = 30, b = 20;
        float c = 20f, d = 2f;

        // Arithmetic operator in java
        System.out.println("Arithmetic Operators\n");
        System.out.println("The value of a = "+a+" and b = "+b);
        System.out.println("The sum of "+a+" and "+b+" is "+(a + b));
        System.out.println("The subtraction of "+a+" and "+b+" is "+(a - b));
        System.out.println("The multiplication of "+a+" and "+b+" is "+(a * b));
        System.out.println("The division of "+c+" and "+d+" is "+(c / d));
        System.out.println("The modulus of "+a+" and "+b+" is "+(a % b));

        // Assignment Operator
        System.out.println("\nAssignment Operator\n");
        System.out.println("The value of a = "+a+" and b = "+b);
        System.out.println("The solution of "+a+" += "+b+" is "+(a += b));
        System.out.println("The solution of "+a+" -= "+b+" is "+(a -= b));
        System.out.println("The solution of "+a+" *= "+b+" is "+(a *= b));
        System.out.println("The solution of "+a+" /= "+b+" is "+(float)(a /= b));

        // logical Operator
        System.out.println("\nLogical Operator\n");
        System.out.println("The value of a = "+a+" and b = "+b);
        System.out.println("The solution of (20=="+a+") && (30=="+b+") is "+((a == 20) && (b==30)));
        System.out.println("The solution of (30=="+a+") || (40=="+b+") is "+((a==30) || (b==40)));
        System.out.println("The solution of "+a+" != "+b+" is "+(a != b));

        // Bitwise Operator
        System.out.println("\nBitwise Operator\n");
        System.out.println("The value of a = "+a+" and b = "+b);
        System.out.println("The solution a & b is "+(a & b));
        System.out.println("The solution of a | b is "+(a | b));

    }
}
