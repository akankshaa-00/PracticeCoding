package org.example.multithreading;

public class Main {

    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread1());
        t1.start();

        MyThread2  t2=new MyThread2();
        t2.start();
    }
}
