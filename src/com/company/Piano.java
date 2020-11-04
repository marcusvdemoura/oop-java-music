package com.company;

public class Piano extends Sounds{

    public Piano (){


    }

    public String getSound() {
        return Sounds.sound("Piano Sound");
    }


    public String instrumentName (){

        return "Piano";
    }
}
