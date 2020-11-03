package com.company;

public abstract class Sounds {

    static boolean testSound = true;

    public static void sound (String sound){
        if (testSound){
            System.out.println(sound);
        }
    }

}
