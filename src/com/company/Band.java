package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Band {

    private String name;
    private String style;
    Musician musician;

    private HashMap<String, String> listOfMusicians = new HashMap<>();
//    private ArrayList<Musician> listOfMusicians = new ArrayList<>();


    public Band(String name, String style) {
        this.name = name;
        this.style = style;

    }

    public void bandList(Musician musicianToAdd) {
        listOfMusicians.put(musician.getMusicianName(), musician.getInstrumentPlayed());
    }

    public String getName() {

        return name;
    }

    public String getStyle() {

        return style;
    }

    public HashMap<String, String> getListOfMusicians() {
        return listOfMusicians;
    }


    public void printListMusicians() {
        Iterator it = getListOfMusicians().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }


    }
}
