package com.company;

public class TestRunner {


    Guitar guitar1 = new Guitar();
    BaseGuitar baseGuitar1 = new BaseGuitar();
    Drums drums1 = new Drums();
    KeyBoard keyBoard1 = new KeyBoard();
    MusicalNotes musicalNotes = new MusicalNotes();
    Musician musician1 = new Musician("Jorge", baseGuitar1);
    Musician musician2 = new Musician("Luke", guitar1);
    Musician musician3 = new Musician("Ken", drums1);
    Musician musician4 = new Musician("Louis", keyBoard1);
    Musician musician5 = new Musician("Kevin", musicalNotes);
    Band band1 = new Band("Hallo Maters", "Rock");
    Orchestra orchestra1 = new Orchestra("National Orchestra", "Chamber");



    public void Run() {

        band1.bandList(musician1);
        band1.bandList(musician2);
        band1.bandList(musician3);
        band1.bandList(musician4);
        band1.bandList(musician5);

        band1.printListMusicians(); //I'm not sure how to print
        // the hashmap with both key (name of the musician) and value (instrument played)...


    }


}
