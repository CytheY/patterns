package kompositum;

import java.util.Iterator;

public class Speise extends SpeisekartenKomponente{
    String name;
    String beschreibung;
    boolean vegetarisch;
    double preis;

    public Speise(String name, String beschreibung, boolean vegetarisch, double preis) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.vegetarisch = vegetarisch;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public boolean isVegetarisch() {
        return vegetarisch;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public Iterator erstelleIterator() {
        return new NullIterator();
    }

    public void ausgeben() {
        System.out.print(" " + getName());
        if (isVegetarisch()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPreis());
        System.out.println(" -- " + getBeschreibung());
    }
}
