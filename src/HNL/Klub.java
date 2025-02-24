package HNL;


import java.util.Random;

/*
Klub ima osobine:
•	ID
•	Naziv
•	Grad
•	Trener
 */
public class Klub {
    private static int zadnjiID = 0;
    private int ID;
    private String naziv;
    private String grad;
    private Trener trener;

    public Klub(String naziv, String grad, Trener trener) {
        this.naziv = naziv;
        this.grad = grad;
        this.trener = trener;
        this.ID = zadnjiID;
        zadnjiID++;
    }

    @Override
    public String toString() {
        return naziv + "(" + grad+ ")";
    }

    public Trener getTrener() {
        return trener;
    }

    public static Klub generateKlub() {
        return new Klub("Klub"+zadnjiID, "Grad"+ (new Random()).nextInt(1,101), Trener.generateTrener());
    }
}
