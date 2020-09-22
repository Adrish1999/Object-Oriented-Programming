import java.io.*;

abstract class EMP
{
    String emp_name;
    int emp_id;
    String doj;
    public abstract void getinfo() throws IOException;
    public abstract double get_sal(int basic_salary , int allowance);
}

class Manager extends EMP
{

    public void getinfo() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the Manager: ");
        emp_name = br.readLine();
        System.out.println("Enter the Manager's employee ID: ");
        emp_id = Integer.parseInt(br.readLine());
        System.out.println("Enter the date of joining");
        doj = br.readLine();
    }
    public double get_sal(int basic_salary , int allowance)
    {
        return (double)(basic_salary*(1.0 + (allowance/100.0)));
    }
    public void display()
    {
        System.out.println("Name of the Manager: "+emp_name);
        System.out.println("Manager's employee ID: "+emp_id);
        System.out.println("Date of joining: "+doj);
        System.out.println("Basic salary: Rs 65000");
        System.out.println("Allowance rate: 75%");
    }
}

class Sales extends EMP
{

    public void getinfo() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the Sales Person: ");
        emp_name = br.readLine();
        System.out.println("Enter the Sales Person's employee ID: ");
        emp_id = Integer.parseInt(br.readLine());
        System.out.println("Enter the date of joining: ");
        doj = br.readLine();
    }
    public double get_sal(int basic_salary , int allowance)
    {
        return (double)(basic_salary*(1.0 + (allowance/100.0)));
    }
    public void display()
    {
        System.out.println("Name of the Sales Person: "+emp_name);
        System.out.println("Sales Person's employee ID: "+emp_id);
        System.out.println("Date of joining: "+doj);
        System.out.println("Basic salary: Rs 30000");
        System.out.println("Allowance rate: 99%");
    }
}

class Inheritance_03
{
    public static void main(String args[]) throws IOException
    {
        Manager obj1 = new Manager();
        Sales obj2 = new Sales();
        obj1.getinfo();
        obj1.display();
        System.out.println();
        System.out.println("Total Salary of the Manager is Rs. "+obj1.get_sal(65000, 75));
        obj2.getinfo();
        obj2.display();
        System.out.println();
        System.out.println("Total Salary of the Sales person is Rs. "+obj1.get_sal(30000, 99));
    }
}