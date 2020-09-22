import java.io.*;

abstract class Bank
{
    public abstract double getROI();
    public abstract void display();
}

class SBI extends Bank
{
    public void display()
    {
        System.out.println("Bank name: State Bank Of India");
        System.out.println("Bank ID: 1");
        System.out.println("Bank IFSC Code: 5436");
        System.out.println("Rate of interest on Fixed Deposit: 5%");
    }
    public double getROI()
    {
        return (double)(500000*1.05);
    }
}

class HDFC extends Bank
{
    public void display()
    {
        System.out.println("Bank name: HDFC Bank");
        System.out.println("Bank ID: 2");
        System.out.println("Bank IFSC Code: 5521");
        System.out.println("Rate of interest on Fixed Deposit: 8%");
    }
    public double getROI()
    {
        return (double)(500000*1.08);
    }
}

class PNB extends Bank
{
    public void display()
    {
        System.out.println("Bank name: Punjab National Bank");
        System.out.println("Bank ID: 3");
        System.out.println("Bank IFSC Code: 5841");
        System.out.println("Rate of interest on Fixed Deposit: 6%");
    }
    public double getROI()
    {
        return (double)(500000*1.06);
    }
}

class Inheritance_02
{
    public static void main(String args[])
    {
        SBI obj1 = new SBI();
        HDFC obj2 = new HDFC();
        PNB obj3 = new PNB();
        obj1.display();
        double sbi_amount = obj1.getROI();
        System.out.println("Maturity amount for SBI is: "+sbi_amount);
        obj2.display();
        double hdfc_amount = obj2.getROI();
        System.out.println("Maturity amount for HDFC Bank is: "+hdfc_amount);
        obj3.display();
        double pnb_amount = obj3.getROI();
        System.out.println("Maturity amount for PNB is: "+pnb_amount);
        if(sbi_amount > hdfc_amount && sbi_amount > pnb_amount)
        {
                System.out.println("The person should make the fixed deposit of Rs.500000 in SBI");
        }
        else if(hdfc_amount > sbi_amount && hdfc_amount > pnb_amount)
        {
            System.out.println("The person should make the fixed deposit of Rs.500000 in HDFC Bank");
        }
        else
        {
            System.out.println("The person should make the fixed deposit of Rs.500000 in PNB");
        }
    }
}