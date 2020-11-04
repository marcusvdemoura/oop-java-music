package com.company;

public class Musician {

    private String instrumentPlayed;
    private String musicianName;
    private BaseGuitar baseGuitar;
    private Guitar guitar;
    private Clarinet clarinet;
    private Drums drums;
    private KeyBoard keyboard;
    private Piano piano;
    private MusicalNotes musicalNotes;


    public Musician(String musicianName, BaseGuitar baseGuitar) {
        this.musicianName = musicianName;
        this.baseGuitar = baseGuitar;
        String instrumentPlayed = baseGuitar.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(String musicianName, Clarinet clarinet) {
        this.musicianName = musicianName;
        this.clarinet = clarinet;
        String instrumentPlayed = clarinet.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(String musicianName,Drums drums) {
        this.musicianName = musicianName;
        this.drums = drums;
        String instrumentPlayed = drums.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(String musicianName,KeyBoard keyboard) {
        this.musicianName = musicianName;
        this.keyboard = keyboard;
        String instrumentPlayed = keyboard.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(String musicianName,Piano piano) {
        this.musicianName = musicianName;
        this.piano = piano;
        String instrumentPlayed = piano.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(String musicianName,Guitar guitar) {
        this.musicianName = musicianName;
        this.guitar = guitar;
        String instrumentPlayed = guitar.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public Musician(String musicianName,MusicalNotes musicalNotes) {
        this.musicianName = musicianName;
        this.musicalNotes = musicalNotes;
        String instrumentPlayed = musicalNotes.instrumentName();
        this.instrumentPlayed = instrumentPlayed;
    }

    public String getMusicianName() {
        return musicianName;
    }

    public String getInstrumentPlayed() {

        return instrumentPlayed;
    }

    public String instrument (){

        return "The instrument this musician plays is "+ getInstrumentPlayed();
    }

    public String getSound (){
        return Sounds.sound("la la la la");
    }



}
