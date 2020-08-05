package com.tonyngeno;

public class ThreadOne extends Thread {
    public ThreadOne(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("----Thread One------");
        for (int i=0; i<30; i++){
            for (int j=0; j<i; j++)
                System.out.println(this.getName() + " " + "running and J = " +j);
        }
    }

    public static void main(String args[]) {

        //new thread
        ThreadOne threadOne = new ThreadOne("Thread One");
        ThreadTwo threadTwo = new ThreadTwo("Thread Two");
        Thread runnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("----Thread Three------");
                for (int i=0; i<50; i++){
                    for (int j=0; j<i; j++)
                        System.out.println(Thread.currentThread().getName() + " " + "running and J = " +j);
                }

            }
        },"Thread Three"
        );

        //register to thread pool
        threadOne.start();
        threadTwo.start();
        runnableThread.start();

}
}
