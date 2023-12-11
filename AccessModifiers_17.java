package com.company;

 class Modifiers
 {
     private int id;                    // Private Data Members
     private int salary;                // Private Data Members

     public void setId(int i)           // Setter Method
     {
         id = i;
     }
     public void setSalary(int s)       // Setter Method
     {
         salary = s;
     }
     public int getId()                 // Getter Method
     {
         return id;
     }
     public int getSalary()             // Getter Method
     {
         return salary;
     }
 }

public class AccessModifiers_17
{
    public static void main(String[] args)
    {
        Modifiers obj = new Modifiers();

        obj.setId(2458);                    // Initialization of Private Data Member
        obj.setSalary(600000);              // Initialization of Private Data Member

        System.out.println("Id: "+obj.getId());
        System.out.println("Salary: "+obj.getSalary());

    }
}