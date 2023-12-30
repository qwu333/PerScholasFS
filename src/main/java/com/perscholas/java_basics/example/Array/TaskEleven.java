package com.perscholas.java_basics.example.Array;

import java.util.Arrays;
import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args){
        System.out.println("How many favorite things do you have? Please enter:");
        Scanner inputNumber = new Scanner(System.in);
        int n = inputNumber.nextInt();


        String[] arr = new String[n];
        Scanner inputString = new Scanner(System.in);
        int i = 0;
        while(i<n){
            System.out.println("Enter your thing:");
            arr[i]=inputString.next();
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
