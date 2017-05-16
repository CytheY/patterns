package Iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeSpeisekarte implements Speisekarte {

    private static final String CAFE_DESCRIPTION = "Cafe - Speisekarte";

    private static final String VEGGIE_BURGER = "Veggie Burger";
    private static final String VEGGIE_BURGER_DESCRIPTION = "Veggi Burger mit Köse";
    private static final double VEGGIE_BURGER_PRICE = 4.29;
    private static final boolean VEGGIE_BURGER_ISVEG = true;

    Hashtable speisen = new Hashtable();

    public CafeSpeisekarte () {
        speiseHinzufügen(VEGGIE_BURGER, VEGGIE_BURGER_DESCRIPTION, VEGGIE_BURGER_ISVEG, VEGGIE_BURGER_PRICE);
    }

    private void speiseHinzufügen(String name, String beschreibung, boolean veggi, double preis) {
        Speise speise = new Speise(name, beschreibung, veggi, preis);
        speisen.put(speise.getName(), speise);
    }

    public Hashtable getSpeisen() {
        return speisen;
    }

    public Iterator erstelleIterator(){
        return speisen.values().iterator();
    }
    public String toString() {
        return CAFE_DESCRIPTION;
    }

}
