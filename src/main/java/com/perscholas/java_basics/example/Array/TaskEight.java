package com.perscholas.java_basics.example.Array;

import java.util.Arrays;

public class TaskEight {
    public static void main(String[] args){
        String[] arr= {"a","b","c","d","e"};
        String temp = arr[2];
        arr[2]=arr[0];
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
