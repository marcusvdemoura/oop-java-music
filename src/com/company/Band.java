package com.company;

public class Band {

    private String name;
    private String style;

    Guitar guitar1 = new Guitar();
    BaseGuitar baseGuitar1 = new BaseGuitar();
    Drums drums1 = new Drums();
    KeyBoard keyBoard1 = new KeyBoard();
    MusicalNotes musicalNotes = new MusicalNotes();
    Musician musician1 = new Musician("Jorge",baseGuitar1);
    Musician musician2 = new Musician("Luke", guitar1);
    Musician musician3 = new Musician("Ken", drums1);
    Musician musician4 = new Musician("Louis", keyBoard1);
    Musician musician5 = new Musician("Kevin", musicalNotes);


    public Band (String name, String style){

            this.name=name;
            this.style = style;



    }



    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString(){
        return String.format("This band is composed by: %s on the %s; %s on the %s; %s on the %s; %s on the %s; %s as the %s", musician1.getMusicianName(),
                musician1.getInstrumentPlayed(), musician2.getMusicianName(),
                musician2.getInstrumentPlayed(),musician3.getMusicianName(),
                musician3.getInstrumentPlayed(),musician4.getMusicianName(),
                musician4.getInstrumentPlayed(),musician5.getMusicianName(),
                musician5.getInstrumentPlayed());
    }


}
