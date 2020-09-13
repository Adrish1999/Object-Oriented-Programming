//Java Program to illustrate the concept of Association

import java.io.*;

class Department
{
    String name;
    Department(String name)
    {
        this.name = name;
    }
    public String getDepartmentName()
    {
        return name;
    }
}

class Student
{ 
    String name;  
    Student(String name)  
    { 
        this.name = name; 
    } 
      
    public String getStudentName() 
    { 
        return name; 
    }  
} 


class Program_01_Association
{ 
    public static void main (String[] args) throws IOException
    { 
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(read);
      System.out.println("Enter the student name");
      String student_name = br.readLine();
      System.out.println("Enter the department name");
      String dept_name = br.readLine();
      Student obj1 = new Student(student_name);
      Department obj2 = new Department(dept_name);
      System.out.println(obj1.getStudentName()+" is a student of "+obj2.getDepartmentName()+" department");
    } 
} 