//Java program to overload constructors  

import java.io.*;

class Student
{  
    int id;  
    String name;  
    int age;  

    Student() // default constructor
    {
        id = 0;
        name = "";
        age = 0;
    }
    
    Student(int i,String n) // two-argument constructor
    {  
        id = i;  
        name = n;  
    }  
   
    Student(int i,String n,int a) // three-argument constructor
    {  
        id = i;  
        name = n;  
        age=a;  
    }  

    Student(Student s)
    {
        id = s.id;
        name = s.name;
        age = s.age;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }  
   
    public static void main(String args[])
    {  
        Student s1 = new Student(111,"Karan");  
        Student s2 = new Student(110,"Rahul",20);  
        s1.display();  
        s2.display();  
   }  
}  