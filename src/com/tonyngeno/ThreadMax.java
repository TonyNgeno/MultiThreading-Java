package com.tonyngeno;

public class ThreadMax {
    public static int maxValue(int[] values) throws InterruptedException{
       //array length
        int length = values.length;
        int max = Integer.MIN_VALUE;

        //threads should be four
        MaxValue[] maxThread = new MaxValue[4];

        for (int i = 0; i < 4; i++) {
            int lowestValue = (i * length) / 4;
            int highestValue = ((i + 1) * length / 4);
            maxThread[i] = new MaxValue(values,lowestValue,highestValue);
            maxThread[i].start();
        }


            //getting the final answer
            for (int j=0 ;j<4 ;j++){
                maxThread[j].join();

                if(maxThread[j].max > max){
                    max=maxThread[j].max;
                }

            }

            return  max;
        }

    public static void main(String args[]) throws InterruptedException {
        int[] values = new int[]{2,56,77,4,56,3,45,67,8,90,7,64};
        int max = maxValue(values);
        System.out.println("Max value is:" + max);

    }
}
