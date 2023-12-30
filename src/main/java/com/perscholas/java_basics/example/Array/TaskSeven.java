package com.perscholas.java_basics.example.Array;

import java.util.Arrays;

public class TaskSeven {
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            if(i == 2){continue;}
            arr[i]=i;
            System.out.println(arr[i]);
        }

    }
}
