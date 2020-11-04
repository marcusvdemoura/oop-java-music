package com.company;

public class Orchestra {

    private String name;
    private String type;

    Piano piano1 = new Piano();
    Clarinet clarinet1 = new Clarinet();
    Clarinet clarinet2 = new Clarinet();
    Clarinet clarinet3 = new Clarinet();
    Clarinet clarinet4 = new Clarinet();
    MusicalNotes musicalNotes1 = new MusicalNotes();
    MusicalNotes musicalNotes2 = new MusicalNotes();
    MusicalNotes musicalNotes3 = new MusicalNotes();
    Musician musician1 = new Musician("Jorge",clarinet1);
    Musician musician2 = new Musician("Luke", clarinet2);
    Musician musician3 = new Musician("Ken", clarinet3);
    Musician musician4 = new Musician("Louis", clarinet4);
    Musician musician5 = new Musician("Kevin", piano1);
    Musician musician6 = new Musician("Mike", musicalNotes1);
    Musician musician7 = new Musician("Georgina", musicalNotes2);
    Musician musician8 = new Musician("Mika", musicalNotes3);


    public Orchestra (String name, String type){
        this.name = name;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public String toString(){
        return String.format("This orchestra is composed by: %s on the %s; %s on the %s; %s on the %s; %s on the %s; %s on the %s, %s as a %s, %s as a %s, %s as a %s.", musician1.getMusicianName(),
                musician1.getInstrumentPlayed(), musician2.getMusicianName(),
                musician2.getInstrumentPlayed(),musician3.getMusicianName(),
                musician3.getInstrumentPlayed(),musician4.getMusicianName(),
                musician4.getInstrumentPlayed(),musician5.getMusicianName(),
                musician5.getInstrumentPlayed(), musician6.getMusicianName(),
                musician6.getInstrumentPlayed(),musician7.getMusicianName(),
                musician7.getInstrumentPlayed(),musician8.getMusicianName(),
                musician8.getInstrumentPlayed());
    }
}
