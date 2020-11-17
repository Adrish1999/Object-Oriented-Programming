import java.io.*;

class Student
{
    String name , dept , year , student_id;
    Student()
    {
        name = "";
        dept = "";
        year = "";
        student_id = "";
    }
    void getinfo() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Student Name: ");
        name = br.readLine();
        System.out.println("Enter the Department of Student: ");
        dept = br.readLine();
        System.out.println("Enter the Year of Study of Student: ");
        year = br.readLine();
        System.out.println("Enter the Student ID: ");
        student_id = br.readLine();
    }
    void showinfo()
    {
        System.out.println("Student Name: "+name);
        System.out.println("Student Department: "+dept);
        System.out.println("Student Year Of Study: "+year);   
        System.out.println("Student ID: "+student_id);
    } 
}
class Program_02
{
    public static void main(String[] args) throws IOException
    {
        Student obj[] = new Student[5];
        for(int i=0 ; i < 5 ; i++)
        {
            System.out.println("Enter the details for Student "+(i+1));
            obj[i] = new Student();
            obj[i].getinfo();
            System.out.println("Details of Student "+(i+1)+":");
            obj[i].showinfo(); 
            System.out.println();
            System.out.println();          
        }
    }
}