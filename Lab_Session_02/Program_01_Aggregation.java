import java.io.*;
import java.util.*;

class Student
{
    String name;
    String department;
    int roll;
    Student(String name , String department , int roll)
    {
        this.name = name;
        this.department = department;
        this.roll = roll;
    }
}

class Department
{
    String name; 
    private List<Student> students; 
    Department(String name, List<Student> students)  
    { 
          
        this.name = name; 
        this.students = students; 
          
    } 
      
    public List<Student> getStudents()  
    { 
        return students; 
    } 
}

class Institute  
{ 
      
    String instituteName; 
    private List<Department> departments; 
      
    Institute(String instituteName, List<Department> departments) 
    { 
        this.instituteName = instituteName; 
        this.departments = departments; 
    } 
      
    public int getTotalStudentsInInstitute() 
    { 
        int noOfStudents = 0; 
        List<Student> students;  
        for(Department dept : departments) 
        { 
            students = dept.getStudents(); 
            for(Student s : students) 
            { 
                noOfStudents++; 
            } 
        } 
        return noOfStudents; 
    } 
      
}  
  
class Program_01_Aggregation 
{
    public static void main(String args[])
    {
        Student s1 = new Student("Adrish","CSE",1); 
        Student s2 = new Student("Manish","CSE",2); 
        Student s3 = new Student("John","ECE",1); 
        Student s4 = new Student("Rahul","ECE",2); 

        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);

        List<Student> ece_students = new ArrayList<Student>();
        ece_students.add(s3);
        ece_students.add(s4);

        Department CSE = new Department("CSE",cse_students);
        Department ECE = new Department("ECE",ece_students);

        List<Department> depts = new ArrayList<Department>();
        depts.add(CSE);
        depts.add(ECE);

        Institute inst = new Institute("STCET",depts);
        System.out.println("Total number of students in STCET is "+inst.getTotalStudentsInInstitute());

    }    
}