package com.tonyngeno.ReverseHello;

public class ReverseHello extends Thread {

    public static void main(String[] args) {
        // Create tasks

        Runnable printNo = new PrintNum(50);
        // Create threads
        Thread thread1 = new Thread(printNo);

        // Start threads

        thread1.start();
    }
}

    // The task class for printing number from 1 to n for a given n
    class PrintNum implements Runnable {

    public int count;
    private int lastNum;

    //Construct a task for printing 1, 2, ... i
    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
    public void run() {

        count++;
        while (count <=50){
            System.out.println("Hello from thread " + (51-count));
            run();
        }

    }
}
