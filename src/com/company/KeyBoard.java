package com.company;

public class KeyBoard extends Sounds {

    public KeyBoard() {

    }


    public String instrumentName() {
        return "Keyboard";
    }

    public String getSound() {
        return Sounds.sound("Keyboard Sound");
    }
}
