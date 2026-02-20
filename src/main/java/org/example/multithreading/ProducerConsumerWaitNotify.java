package org.example.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerWaitNotify {

    private static final int CAPACITY = 5;
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        Thread producer=new Thread(()->{
            int value=0;
            try {
                while (true) {
                    synchronized (queue) {
                        while (queue.size() == CAPACITY)
                        {
                            queue.wait();
                        }
                        System.out.println("Producer produced" + value);
                        queue.add(value);
                        value++;
                        queue.notify();
                    }
                }
            }catch(Exception e){
                System.out.println(e);
            }
        });

        Runnable consumer=()->{

            try {
                while (true) {
                    synchronized (queue) {
                        while (queue.isEmpty())
                        {
                            queue.wait();
                        }
                        int value = queue.poll();
                        System.out.println("Consumer consumed" + value);
                        queue.notify();
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        producer.start();
        new Thread(consumer).start();;
    }

}
