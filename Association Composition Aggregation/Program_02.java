//Java program to create a class Student which contains members - dept , roll , name , year and instantiate the class into main method.

import java.io.*;

class Student
{
    String dept;
    int roll;
    String name;
    String year;
    Student(String dept , int roll , String name , String year)
    {
        this.dept = dept;
        this.roll = roll;
        this.name = name;
        this.year = year;
    }
    public void DisplayStudentDetails()
    {
        System.out.println("Student Department : "+dept);
        System.out.println("Student Roll no : "+roll);
        System.out.println("Student Name : "+name);
        System.out.println("Student Year : "+year);
    }
}

class Program_02
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        System.out.println("Enter department of student");
        String dept = br.readLine();
        System.out.println("Enter roll-no of student");
        int roll = Integer.parseInt(br.readLine());
        System.out.println("Enter name of student");
        String name = br.readLine();
        System.out.println("Enter year of student");
        String year = br.readLine();
        Student s = new Student(dept,roll,name,year);
        s.DisplayStudentDetails();
    }
}