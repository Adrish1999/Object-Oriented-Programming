//A program in JAVA to handle exceptions when the overridden function throws an exception but that exception is not declared in the parent class. 


import java.io.*; 
  
class SuperClass 
{   
    // SuperClass doesn't declare any exception 
    void method(int a,int b) 
    { 
        System.out.println("SuperClass is executing........");
        System.out.println("a = "+a);
        System.out.println("b = "+b); 
    } 
} 
  
// SuperClass inherited by the SubClass 
class SubClass extends SuperClass 
{ 
    // method() declaring Un-checked Exception ArithmeticException 
    void method(int a,int b) throws ArithmeticException
    { 
        System.out.println("SubClass is executing............");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a/b = "+a/b);
    } 
}

class Program_01
{
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass s = new SubClass(); 
        s.method(10,0); 
    } 
} 