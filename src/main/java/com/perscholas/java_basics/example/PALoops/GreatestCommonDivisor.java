package com.perscholas.java_basics.example.PALoops;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        scan.close();
        int n = 0;
        int common = 0;
        if (n1 >= n2) {
            n = n1;
        } else {
            n = n2;
        }
        for(int i = 1; i<=n; i++){
            if(n1%i == 0 && n2%i ==0){
                common = i;
            }
        }
        System.out.println(common);

    }
}
