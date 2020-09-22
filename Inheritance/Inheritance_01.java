import java.io.*;

class Student
{
    String name;
    int roll;
    public void accept() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the student name");
        name = br.readLine();
        System.out.println("Enter student roll no.");
        roll = Integer.parseInt(br.readLine());
    }
    public void show()
    {
        System.out.println("Name: "+name+" and Roll no: "+roll);
    }
}

class Marks extends Student
{
    float sub1 , sub2;
    public void getMarks(float x , float y)
    {
        sub1 = x;
        sub2 = y;
    }
    public void displayMarks()
    {
        System.out.println("Marks obtained are "+sub1+" and "+sub2);
    }
}

class Result extends Marks
{
    public void display()
    {
        float total = sub1 + sub2;
        show();
        displayMarks();
        System.out.println("Total marks = "+total);
    }
}
class Inheritance_01
{
    public static void main(String args[]) throws IOException
    {
        Result obj = new Result();
        obj.accept();
        obj.getMarks(99,100);
        obj.display();
    }
}