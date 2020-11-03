package com.company;

public class Musician {

    private static String instrumentPlayed;
    private BaseGuitar baseGuitar;
    private Guitar guitar;
    private Clarinet clarinet;
    private Drums drums;
    private KeyBoard keyboard;
    private Piano piano;
    private MusicalNotes musicalNotes;


    public Musician(BaseGuitar baseGuitar) {
        this.baseGuitar = baseGuitar;
        String instrumentPlayed = baseGuitar.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(Clarinet clarinet) {
        this.clarinet = clarinet;
        String instrumentPlayed = clarinet.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(Drums drums) {
        this.drums = drums;
        String instrumentPlayed = drums.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(KeyBoard keyboard) {
        this.keyboard = keyboard;
        String instrumentPlayed = keyboard.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(Piano piano) {
        this.piano = piano;
        String instrumentPlayed = piano.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(Guitar guitar) {
        this.guitar = guitar;
        String instrumentPlayed = guitar.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(MusicalNotes musicalNotes) {
        this.musicalNotes = musicalNotes;
        String instrumentPlayed = musicalNotes.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public static String instrument (){
        return "The instrument this musician plays is "+ getInstrumentPlayed();
    }

    public static String getInstrumentPlayed() {
        return instrumentPlayed;
    }
}
