package com.perscholas.java_basics.example.FlowControl;

import java.util.Scanner;

public class PAFive {
    //score
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score <= 50) {
            System.out.println("F");
        } else{
            System.out.println("Score out of range");
        }
    }
}