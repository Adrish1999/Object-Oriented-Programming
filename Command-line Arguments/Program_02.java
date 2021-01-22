//Program to find out average of 5 numbers

class Program_02
{
    public static void main(String args[])
    {
        int sum = 0;
        double average = 0.0;
        for(int i = 0; i < 5 ; i++)
        {
            sum += Integer.parseInt(args[i]);
        }
        average = sum / 5.0;
        System.out.println("The entered numbers are :");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(Integer.parseInt(args[i]));
        }
        System.out.println("The average of the entered numbers are : "+average);
    }
}