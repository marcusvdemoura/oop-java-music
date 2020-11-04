package com.company;

public class BaseGuitar extends Sounds{

    public BaseGuitar (){

    }

    public String instrumentName (){

        return "Base guitar";
    }

    public String getSound (){
        return Sounds.sound("Base guitar sound");
    }







}

