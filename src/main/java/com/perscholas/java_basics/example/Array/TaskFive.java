package com.perscholas.java_basics.example.Array;

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
