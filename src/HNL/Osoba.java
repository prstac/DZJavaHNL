package HNL;

import java.util.Random;

public class Osoba {
    private String ime;
    private String prezime;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public static Osoba generateOsoba() {
        return new Osoba("ime"+ new Random().nextInt(1,101), "prezime"+new Random().nextInt(1,101));
    }
}
