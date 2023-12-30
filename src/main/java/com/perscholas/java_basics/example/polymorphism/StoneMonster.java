package com.perscholas.java_basics.example.polymorphism;

public class StoneMonster extends Monster{
    public StoneMonster(String fight){
        fight = "stone";
    }
    public String attack(){
        return("Attack with stone!");
    }
}
