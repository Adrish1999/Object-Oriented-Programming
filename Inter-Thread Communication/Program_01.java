//Describe the case where inter thread communication does follow synchronization through we have incorporated synchronized word.

import java.io.*;

class Q
{
    int n;
    boolean valueSet = false;

    synchronized int get()
    {
        while(!valueSet)
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted Exception caught");
            }
        
            System.out.println("Got: "+n);
            valueSet = false;
            notify();
            return n;
    }

    synchronized void put(int n)
    {
        while(valueSet)
        try{
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted Exception caught");
        }

        this.n = n;
        valueSet = true;
        System.out.println("Put: "+n);
        notify();
    }
}


class Producer implements Runnable
{
    Q q;
    Producer(Q q)
    {
        this.q = q;
        new Thread(this,"Producer").start();
    }

    public void run()
    {
        int i = 0;

        while(true)
        {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable
{
    Q q;
    Consumer(Q q)
    {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run()
    {
        while(true)
        {
            q.get();
        }
    }
}

class Program_01
{
    public static void main(String args[])
    {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press Ctrl+C to stop");
    }
}

