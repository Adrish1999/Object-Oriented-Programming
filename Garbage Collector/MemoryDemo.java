import java.io.*;

class MemoryDemo
{
    public static void main(String args[])
    {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer integer[] = new Integer[1000];

        System.out.println("Total memory allocated is: "+r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Initial free memory: "+mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection is : "+mem1);

        for(int i = 0; i < 1000; i++)
        integer[i] = i;

        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation :"+mem2);
        System.out.println("Memory used by allocation :"+(mem1-mem2));

        //discard integers
        for(int i=0; i < 1000; i++)
        integer[i] = null;

        r.gc();

        mem2 = r.freeMemory();
        System.out.println("Free memory after discarding integers: "+mem2);
    }
}