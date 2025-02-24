package HNL;


import java.util.Random;

/*
Trener ima osobine:
•	Ime, prezime
•	Godine iskustva
 */
public class Trener extends Osoba{
    private int godineIskustva;

    public Trener(String ime, String prezime, int godineIskustva) {
        super(ime, prezime);
        this.godineIskustva = godineIskustva;
    }

    public static Trener generateTrener() {
        var osoba = Osoba.generateOsoba();
        return new Trener(osoba.getIme(), osoba.getPrezime(), new Random().nextInt(1,101));
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime() + " godine iskustva: " + godineIskustva;
    }
}
