package com.tonyngeno;

public class MaxValue extends Thread{


    //store values in array
    private int[] values;
    private int lowest;
    private int highest;
    int max = Integer.MIN_VALUE;


    public MaxValue( int[] values, int lowest, int highest){
        this.values = values;
        this.lowest = lowest;
        this.highest = highest;

    }
    @Override
    public void run() {
        for (int j = lowest; j < highest; j++)
        {
            if (values[j] > max)
            {
                max = values[j];
            }

        }
    }

}
