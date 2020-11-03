package com.company;

public class Guitar extends Sounds{

    public Guitar (){
        Sounds.sound ("Guitar Sound");
    }


    public String instrumentName (){
        return "Guitar";
    }
}
