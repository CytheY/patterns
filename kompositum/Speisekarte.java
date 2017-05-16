package kompositum;

import java.util.ArrayList;
import java.util.Iterator;

public class Speisekarte extends SpeisekartenKomponente {
    ArrayList<SpeisekartenKomponente> speisekartenKomponenten = new ArrayList();
    String name;
    String beschreibung;

    public Speisekarte(String name, String beschreibung) {
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public void hinzufügen(SpeisekartenKomponente spk){
        speisekartenKomponenten.add(spk);
    }

    public void entfernen(SpeisekartenKomponente spk){
        speisekartenKomponenten.remove(spk);
    }

    public SpeisekartenKomponente getKind(int i){
        return speisekartenKomponenten.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBeschreibung() {
        return beschreibung;
    }

    public Iterator erstelleIterator() {
        return new KompositumIterator
                (speisekartenKomponenten.iterator());
    }

    public void ausgeben() {
        System.out.print("\n" + getName());
        System.out.println(", " + getBeschreibung());
        System.out.println("---------------------");
        Iterator iterator =
                speisekartenKomponenten.iterator();
        while (iterator.hasNext()) {
            SpeisekartenKomponente
                    speisekartenKomponente =
                    (SpeisekartenKomponente)iterator.next();
            speisekartenKomponente.ausgeben();
        }
    }


}
