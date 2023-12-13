package com.perscholas.java_basics.example.PALoops;

public class MultiplicationTable {
    public static void main(String[] args){
        for(int i = 1; i<=12; i++){
            for(int j = 1; j<=12; j++){
                int mult = i * j;
                System.out.print(mult+ "\t");
            }
            System.out.println();
        }

    }
}
