import java.io.*; 

class method
{ 
	
	public static String Name = ""; 
	
    public static void display(String name)
    { 
		
		Name = name; 
	} 
} 

class Static_Method_Example 
{ 
    public static void main (String[] args)
    { 
		
		// Accessing the static method display() and 
		// field by class name itself. 
		method.display("Adrish"); 
		System.out.println(method.Name); 
		
		// Accessing the static method display() by using Object's reference. 
		method obj = new method(); 
		obj.display("Bose"); 
		System.out.println(obj.Name); 
		
	} 
} 
