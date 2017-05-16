package kompositum;

import java.util.ArrayList;
import java.util.Iterator;

public class Kellnerin {
    Speisekarte alleSpeisekarten;

    public Kellnerin(Speisekarte speisekartenKompositum) {
        this.alleSpeisekarten = speisekartenKompositum;
    }

    public void vegetarischeSpeisekarteAusgeben() {
        Iterator iterator = alleSpeisekarten.erstelleIterator();

        System.out.println("\nVEGETARISCHE SPEISEKARTE\n----");
        while (iterator.hasNext()) {
            SpeisekartenKomponente speisekartenKomponente =
                    (SpeisekartenKomponente)iterator.next();
            try {
                if (speisekartenKomponente.isVegetarisch()) {
                    speisekartenKomponente.ausgeben();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
