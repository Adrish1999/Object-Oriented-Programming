import java.io.*;

class TestGC
{
    // finalize method: called on object once  
    // before garbage collecting it
    @Override
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 
}

class Program_01
{
    public static void main(String args[])
    {  
        TestGC gc1 = new TestGC();  
        TestGC gc2 = new TestGC();  
        gc1 = null;  //nullify gc1
     
        System.gc();  //request for GC to run 
        System.out.println("Object garbage collected : " + gc1);

        gc2 = null;  //nullify gc2

        Runtime.getRuntime().gc(); //request for GC to run
        System.out.println("Object garbage collected : " + gc2);
    }  
}