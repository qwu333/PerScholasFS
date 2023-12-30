package com.perscholas.java_basics.example.polymorphism;

public class FireMonster extends Monster {
    public FireMonster(String fight){
        fight = "fire";
    }
    public String attack(){
        return("Attack with fire!");
    }
}
