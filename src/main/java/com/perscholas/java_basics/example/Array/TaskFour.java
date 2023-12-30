package com.perscholas.java_basics.example.Array;

public class TaskFour {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]=1;
        arr[arr.length-1]=5;
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr.length);
        System.out.println(arr[arr.length]);
        arr[5]=6;
        System.out.println(arr[arr.length]);

    }
}
