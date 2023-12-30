package com.perscholas.java_basics.example.FlowControl;

import java.util.Scanner;

public class PASeven {
    //status and income
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String status = (input.next()).toLowerCase();
        int income = input.nextInt();
        double tax = 0;

        if(status.equals("single")){
            if(income >= 0 && income <= 8350){
                tax = income * 0.1;
            }else if(income >= 8351 && income <= 33950){
                tax = income * 0.15;
            }else if(income >= 33951 && income <= 82250){
                tax = income * 0.25;
            }else if(income >= 82251 && income <= 171550){
                tax = income * 0.28;
            }else if(income >= 171551 && income <= 375950){
                tax = income * 0.33;
            }else if(income >= 372951){
                tax = income * 0.35;
            }
        }else if(status.equals("married filing jointly" )|| status.equals("qualifying widower") ){
            if(income >= 0 && income <= 16700){
                tax = income * 0.1;
            }else if(income >= 16701 && income <= 67900){
                tax = income * 0.15;
            }else if(income >= 67901 && income <= 137050){
                tax = income * 0.25;
            }else if(income >= 137051 && income <= 208850){
                tax = income * 0.28;
            }else if(income >= 208851 && income <= 372950){
                tax = income * 0.33;
            }else if(income >= 372951){
                tax = income * 0.35;
            }
        }else if(status.equals("married filing separately")){
            if(income >= 0 && income <= 8350){
                tax = income * 0.1;
            }else if(income >= 8351 && income <= 33950){
                tax = income * 0.15;
            }else if(income >= 33951 && income <= 68525){
                tax = income * 0.25;
            }else if(income >= 68526 && income <= 104425){
                tax = income * 0.28;
            }else if(income >= 104426 && income <= 186475){
                tax = income * 0.33;
            }else if(income >= 186476){
                tax = income * 0.35;
            }
        }else if(status.equals("Head of Household") ){
            if(income >= 0 && income <= 11950){
                tax = income * 0.1;
            }else if(income >= 11951 && income <= 45500){
                tax = income * 0.15;
            }else if(income >= 45501 && income <= 117450){
                tax = income * 0.25;
            }else if(income >= 117451 && income <= 190200){
                tax = income * 0.28;
            }else if(income >= 190201 && income <= 372950){
                tax = income * 0.33;
            }else if(income >= 372951){
                tax = income * 0.35;
            }
        }

        System.out.printf("tax is %,.2f", tax);
    }

}
