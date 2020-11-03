package com.company;

public class TestRunner {

        public void Run (){


            Guitar guitar1 = new Guitar();
            BaseGuitar baseGuitar1 = new BaseGuitar();
            Clarinet clarinet1 = new Clarinet();
            Drums drums1 = new Drums();
            KeyBoard keyBoard1 = new KeyBoard();
            MusicalNotes musicalNotes = new MusicalNotes();
            Piano piano1 = new Piano();
            Musician musician1 = new Musician (baseGuitar1);
            Musician musician2 = new Musician (guitar1);
            Musician musician3 = new Musician (drums1);
            Musician musician4 = new Musician (keyBoard1);
            Musician musician5 = new Musician (musicalNotes);


            baseGuitar1.sound("base guitar sound");


        }


}
