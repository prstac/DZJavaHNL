package HNL;


/*
Utakmica ima osobine:
•	ID
•	Klub domaćin
•	Klub gost
•	Rezultat domaćin
•	Rezultat gost
•	Strijelci domaći
•	Strijelci gost
 */

import java.io.InterruptedIOException;
import java.util.*;

public class Utakmica {
    private static int zadnjiID = 0;
    private int ID = 0;
    private Klub domacin;
    private Klub gost;
    private int rezultatDomacin;
    private int rezultatGost;
    private List<Igrac> strijelciDomaci = new ArrayList<>();
    private List<Igrac> strijelciGost = new ArrayList<>();

    @Override
    public String toString() {


        var utakmicaNaslov = String.format("%s vs %s %s : %s\n", domacin, gost, rezultatDomacin, rezultatGost);
        var utakmicaTrenerDomacin = String.format("Trener domacin: \n\t%s\n", domacin.getTrener());
        var strijelci1String = strijelciToString(strijelciDomaci, "domacin");
        var utakmicaTrenerGostiju = String.format("Trener gostiju: \n\t%s\n", gost.getTrener());
        var strijelci2String = strijelciToString(strijelciDomaci, "gost");
        return utakmicaNaslov+utakmicaTrenerDomacin+strijelci1String+utakmicaTrenerGostiju+strijelci2String+"--------------------";
    }


    private String strijelciToString(List<Igrac> igraci, String ciji) {
        StringBuilder strijelciString = new StringBuilder(String.format("Strijelci %s:\n",ciji));
        for (Igrac igrac : strijelciDomaci) {
            strijelciString.append(igrac).append("\n");
        }
        strijelciString.append("\n");
        return strijelciString.toString();
    }

    public Utakmica(Klub domacin, Klub gost, int rezultatDomacin, int rezultatGost, List<Igrac> strijelciDomaci, List<Igrac> strijelciGost) {
        this.domacin = domacin;
        this.gost = gost;
        this.rezultatDomacin = rezultatDomacin;
        this.rezultatGost = rezultatGost;
        this.strijelciDomaci = strijelciDomaci;
        this.strijelciGost = strijelciGost;
        this.ID = zadnjiID;
        zadnjiID++;
    }

    public static Utakmica generateUtakmica() {
        int rezultat1 = new Random().nextInt(0, 20);
        int rezultat2 = new Random().nextInt(0, 20);
        var strijelci1 = generateStrijelci(generateIgraci(), rezultat1);
        var strijelci2 = generateStrijelci(generateIgraci(), rezultat2);

        return new Utakmica(
                Klub.generateKlub(),
                Klub.generateKlub(),
                rezultat1,
                rezultat2,
                strijelci1,
                strijelci2);
    }

    public static List<Igrac> generateIgraci() {
        List<Igrac> igraci = new ArrayList<>();
        for (int i = 1; i < 23; i++) {
            igraci.add(Igrac.generateIgrac());
        }
        return igraci;
    }
    public static List<Igrac> generateStrijelci(List<Igrac> igraci, int brojGolova) {
        List<Igrac> strijelci = new ArrayList<>();
        for (int i = 0; i < brojGolova; i++) {
            Collections.shuffle(igraci);
            var igrac = igraci.getFirst();
            if (!strijelci.contains(igrac)) {
                strijelci.add(igrac);
            }
        }
        return strijelci;
    }

}
