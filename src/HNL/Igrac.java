package HNL;

import java.util.Random;

/*
Igrač ima osobine:
•	broj
•	veličina kopačke
•	ime, prezime
 */
public class Igrac extends Osoba{
    private int broj;
    private int velicinaKopacke;

    public Igrac(String ime, String prezime, int broj, int velicinaKopacke) {
        super(ime, prezime);
        this.broj = broj;
        this.velicinaKopacke = velicinaKopacke;
    }

    public static Igrac generateIgrac() {
        var osoba = Osoba.generateOsoba();
        return new Igrac(osoba.getIme(), osoba.getPrezime(), new Random().nextInt(1,101), new Random().nextInt(40,50));
    }

    @Override
    public String toString() {
        return String.format("(%s) %s %s", broj, getIme(), getPrezime());
    }
}
