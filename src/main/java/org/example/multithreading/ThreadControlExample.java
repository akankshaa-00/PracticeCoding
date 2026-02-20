package org.example.multithreading;

public class ThreadControlExample{

    public static void main(String[] args) throws InterruptedException {

        Thread t=new Thread(()->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Worker: " + i);
                try{
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Worker Interrupted"+e);
                    return;
                }
            }
        });
        t.start();

        t.join(1000);
        if(t.isAlive()){
            System.out.println("Worker thread is still alive" );
            t.interrupt();
        }
        System.out.println("Main finished");
    }
}
