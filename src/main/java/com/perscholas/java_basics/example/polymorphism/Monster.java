package com.perscholas.java_basics.example.polymorphism;

public class Monster {
    String fight;
    public Monster(){
        fight = "";
    }
    public Monster(String aFight){
        fight = aFight;

    }
    public String getFight(){
        return fight;
    }
    public void setFight(String aFight){
        fight = aFight;
    }
    public String attack(){
        return("#$@#$%#%# I don't know how to attack!");
    }



}
