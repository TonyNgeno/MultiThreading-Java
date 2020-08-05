package com.tonyngeno;

public class ThreadTwo extends Thread {
    public ThreadTwo(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("----Thread One------");
        for (int i=0; i<70; i++){
            for (int j=0; j<i; j++)
                System.out.println(this.getName() + " " + "running and J = " +j);
        }
    }

}
