package com.perscholas.java_basics.example.Array;

import java.util.Arrays;

public class TaskSix {
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i]=i*2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
