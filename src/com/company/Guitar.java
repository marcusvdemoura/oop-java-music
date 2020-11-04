package com.company;

public class Guitar extends Sounds{

    public Guitar (){

    }


    public String instrumentName (){
        return "Guitar";
    }

    public String getSound (){
        return Sounds.sound ("Guitar Sound");
    }
}
