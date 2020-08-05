package com.tonyngeno;

public class SharedCounter extends Counterthread {

    public static void main(String[] args) {

        sharedCounter();


    }

    public static void sharedCounter(){

        Counterthread[] counter = new Counterthread[10];

        for (int i = 0; i <10; i++){
            counter[i] = new Counterthread();
            counter[i].start();
        }

        System.out.println(Counterthread.counter);
    }



    }

