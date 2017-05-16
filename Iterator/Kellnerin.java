package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Kellnerin {

    ArrayList<Speisekarte> speisekarten;

    public Kellnerin() {
        speisekarten = new ArrayList<>();
    }

    public void addSpeisekarte(Speisekarte speisekarte){
        speisekarten.add(speisekarte);
    }

    public void speisekarteAusgeben(){

        for(Speisekarte sk : speisekarten){
            System.out.println("-----------------------");
            System.out.println(sk);
            speisekarteAusgeben(sk.erstelleIterator());
        }
    }

    private void speisekarteAusgeben(Iterator iterator) {
        while (iterator.hasNext()) {
            Speise speise = (Speise)iterator.next();
            System.out.print(speise.getName() + ", ");
            System.out.print(speise.getPreis() + " -- ");
            System.out.println(speise.getBeschreibung());
        }
    }
}
