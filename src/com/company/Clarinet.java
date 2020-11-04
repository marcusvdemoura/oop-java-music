package com.company;

public class Clarinet extends Sounds{


    public Clarinet (){

    }

    public String instrumentName (){
        return "Clarinet";
    }

    public String getSound() {
        return Sounds.sound ("Clarinet Sound");
    }



}
