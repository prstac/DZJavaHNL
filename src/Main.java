

/*
Program mora omogućiti sljedeće:
•	klubovi i utakmice imaju ključ (id) koji se sam uvećava (autoincrement) pri instanciranju novog objekta
•	unos novog rezultata
•	trener je dio kluba, ali igrači se unose samo kao strijelci utakmice
•	unos strijelaca (obavezan podatak, ne možete unijeti rezultat ako niste unijeli i strijelce)
•	ispis tablice utakmica
•	+ ispis tablice strijelaca
•	ispis aktivnih klubova lige
Klubove i igrače definirajte u programu, ne morate ih unositi kroz izbornik. Koristeći paradigmuOOP, oblikujte rješenje
 */

import HNL.Utakmica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Utakmica> utakmice = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            utakmice.add(Utakmica.generateUtakmica());
        }

        utakmice.forEach(utakmica -> {
            System.out.println(utakmica);
        });
    }
}