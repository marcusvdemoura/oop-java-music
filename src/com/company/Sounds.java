package com.company;

public abstract class Sounds {

    static boolean testSound = true;

    public static String sound(String sound) {
        if (testSound) {
            return sound;
        } else {
            return "";
        }
    }

}
