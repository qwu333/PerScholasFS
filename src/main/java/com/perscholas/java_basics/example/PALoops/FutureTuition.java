package com.perscholas.java_basics.example.PALoops;

public class FutureTuition {
    public static void main(String[] args){
        double tuition = 10000;
        double tuitionD = 20000;
        int year = 0;
        while (tuition<tuitionD){
            tuition = tuition*1.07;
            year ++;
        }
        System.out.println(year);
    }
}
