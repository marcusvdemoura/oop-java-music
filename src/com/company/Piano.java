package com.company;

public class Piano extends Sounds{

    public Piano (){
        Sounds.sound ("Piano Sound");
    }


    public String instrumentName (){
        return "Piano";
    }
}
