package HNL;


import java.util.ArrayList;
import java.util.List;

/*
Liga se sastoji od dvije kolekcije – List/ArrayList (Utakmice, Klubovi) i treba imati metode za ispis Aktivnih klubova i Ispis Utakmica.

 */
public class Liga {
    private List<Utakmica> utakmice = new ArrayList<>();
    private List<Klub> klubovi = new ArrayList<>();

    public void ispisiUtakmice() {

    }

    public void ispisiAktivneKlubove() {

    }

    public void generateKlubovi() {
        for (int i = 0; i <20 ; i++) {
            klubovi.add(Klub.generateKlub());
        }
    }

    public void generateUtakmice() {

        Utakmica.generateUtakmica();
    }


}
