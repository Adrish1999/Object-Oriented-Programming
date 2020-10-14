import java.io.*;

class Employee
{
    String empid , empname , dob , doj , designation;
    Employee()
    {
        empid = "";
        empname = "";
        dob = "";
        doj = "";
        designation = "";
    }
    void getinfo() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Employee ID: ");
        empid = br.readLine();
        System.out.println("Enter the Employee Name: ");
        empname = br.readLine();
        System.out.println("Enter the Employee Date of birth: ");
        dob = br.readLine();
        System.out.println("Enter the Employee Date of joining: ");
        doj = br.readLine();
        System.out.println("Enter the Employee Designation");
        designation = br.readLine();
    }
    void showinfo()
    {
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+empname);
        System.out.println("Employee Date of birth: "+dob);   
        System.out.println("Employee Date of joining: "+doj);
        System.out.println("Employee Designation: "+designation);  
    } 
}
class Program_02
{
    public static void main(String[] args) throws IOException
    {
        Employee obj[] = new Employee[5];
        for(int i=0 ; i < 10 ; i++)
        {
            System.out.println("Enter the details for Employee "+(i+1));
            obj[i] = new Employee();
            obj[i].getinfo();
            System.out.println("Details of Employee "+(i+1)+":");
            obj[i].showinfo();           
        }
    }
}