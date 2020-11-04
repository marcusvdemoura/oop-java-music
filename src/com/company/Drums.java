package com.company;

public class Drums extends Sounds{

    public Drums (){

    }

    public String instrumentName (){
        return "Drums";
    }

    public String getSound() {
        return Sounds.sound("Drums Sound");
    }
}
