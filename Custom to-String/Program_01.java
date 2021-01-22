import java.io.*;


class Complex
{
    int real1, real2, imaginary1, imaginary2;
    Complex(int a, int b, int c, int d)
    {
        this.real1 = a;
        this.real2 = b;
        this.imaginary1 = c;
        this.imaginary2 = d;
    }

    //Custom toString method to print complex number
    public String toString(int real, int imaginary)
    {
        return real + " + " + imaginary + "i";
    }


    public String Addition()
    {
        int real_part = this.real1 + this.real2;
        int imaginary_part = this.imaginary1 + this.imaginary2;
        return this.toString(real_part, imaginary_part);
    }

    public String Subtraction()
    {
        int real_part = this.real1 - this.real2;
        int imaginary_part = this.imaginary1 - this.imaginary2;
        return this.toString(real_part, imaginary_part);
    }


    public String Multiplication()
    {
        int real_part = (this.real1*this.real2) - (this.imaginary1*this.imaginary2);
        int imaginary_part = (this.real1*this.imaginary2) + (this.imaginary1*this.real2);
        return this.toString(real_part, imaginary_part);
    }
}


class Program_01
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the real coefficient of 1st complex number");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the imaginary coefficient of 1st complex number");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter the real coefficient of 2nd complex number");
        int c = Integer.parseInt(br.readLine());
        System.out.println("Enter the imaginary coefficient of 2nd complex number");
        int d = Integer.parseInt(br.readLine());
        Complex obj = new Complex(a,c,b,d);
        System.out.println();
        System.out.println("1st Complex Number : "+obj.toString(a,b));
        System.out.println("2nd Complex Number : "+obj.toString(c,d));
        System.out.println();
        System.out.println("Addition of the 2 complex numbers : "+obj.Addition());
        System.out.println("Subtraction of the 2 complex numbers : "+obj.Subtraction());
        System.out.println("Multiplication of the 2 complex numbers : "+obj.Multiplication());
    }
}