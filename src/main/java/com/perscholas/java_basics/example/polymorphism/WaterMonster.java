package com.perscholas.java_basics.example.polymorphism;

public class WaterMonster extends Monster{
    public WaterMonster(String fight){
        fight = "water";
    }
    public String attack(){
        return("Attack with water!");
    }
}
