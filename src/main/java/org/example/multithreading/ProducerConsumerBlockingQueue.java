package org.example.multithreading;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

    private static int capacity=5;
    public static void main(String[] args) {

       BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(capacity);

       Thread producer=new Thread(()->{
           int val=0;

           try {
               while (true) {
                   System.out.println("Producer produced" + val);
                   queue.put(val);
                   val++;
               }
           }catch (Exception e)
           {
               System.out.println(e);
           }
       });

       Runnable consumer = ()->{

           try {
               while (true) {
                   int val = queue.take();
                   System.out.println("Consumer consumed" + val);

               }
           }catch (Exception e)
           {
               System.out.println(e);
           }
       };

       producer.start();
       new Thread(consumer).start();
    }
}
