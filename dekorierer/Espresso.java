package dekorierer;

public class Espresso extends Getraenk {

    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public String getBeschreibung() {
        return beschreibung;
    }

    @Override
    public double preis() {
        return 1.99;
    }
}
