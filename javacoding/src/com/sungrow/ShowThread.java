package com.sungrow;

public class ShowThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        Thread t2 = new MyThread("MyThread");
        t2.start();

    }
}
