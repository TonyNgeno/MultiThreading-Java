package com.tonyngeno;

public class MyThread extends Thread {
    @Override
    public void run() {
        //work to do(threads work)
        for (int i=0; i<1000; i++)
            for (int j=0; j<i; j++)
        System.out.println("Thread Running....");
    }

    //is a process
    public static void main(String args[]) {

        //new thread
        MyThread myThread = new MyThread();
        //register to thread pool
        myThread.start();

    }
}
