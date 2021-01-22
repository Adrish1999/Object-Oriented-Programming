//A program in JAVA to handle exceptions when the overridden function does not throw an exception but that exception is declared in the parent class. 

import java.io.*; 
  
class SuperClass 
{ 
  
    // SuperClass declares an exception 
    void method() throws RuntimeException 
    { 
        System.out.println("SuperClass is executing........."); 
    } 
} 
  
// SuperClass inherited by the SubClass 
class SubClass extends SuperClass 
{ 
  
    // SubClass declaring an exception 
    // which are not a child exception of RuntimeException 
    void method() throws Exception 
    { 
  
        // Exception is not a child exception 
        // of the RuntimeException 
        // So the compiler will give an error 
  
        System.out.println("SubClass is executing........."); 
    }
}

class Program_03
{ 
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass s = new SubClass(); 
        s.method(); 
    } 
} 