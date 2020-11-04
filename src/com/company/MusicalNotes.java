package com.company;

public class MusicalNotes extends Sounds {

    public MusicalNotes() {


    }

    public String instrumentName() {

        return "Singer";
    }

    public String getSound() {
        return Sounds.sound("la la la la");
    }
}
