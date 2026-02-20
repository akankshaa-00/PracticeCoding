package org.example.multithreading;

public class MyThread1 implements Runnable{

    @Override
    public void run()
    {
        for (int i=0;i<=100;i++)
        {
            System.out.println("2" +"*"+ i+"="+2*i);
        }
    }
}
