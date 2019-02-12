package com.example.unittesting;

public class Util {

    public String getName(){
        return "Bob";
    }

    public String getModName(String s1, boolean toMod){
        if (toMod){
            return s1 + " Modded";
        }else {
            return s1;
        }
    }

}
