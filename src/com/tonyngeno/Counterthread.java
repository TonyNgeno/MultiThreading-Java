package com.tonyngeno;

public class Counterthread extends Thread {
    public static int counter;

    public Counterthread(){

    }

    public Counterthread(int counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i<10; i++){
            counter++;
        }
    }
}
