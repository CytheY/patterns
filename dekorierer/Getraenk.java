package dekorierer;

public abstract class Getraenk {
    public String beschreibung = "Unbekanntes Getränk";

    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double preis();
}
