package com.perscholas.java_basics.example.Array;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args){
        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);
        String[] newArr = arr.clone();
        String colors = Arrays.toString(newArr);
        System.out.println(colors);
    }
}
