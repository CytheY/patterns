package dekorierer;

public class Schoko extends ZutatDekorierer {
    public Getraenk getränk;

    public Schoko(Getraenk getränk) {
        this.getränk = getränk;
    }

    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", dekorierer.Schoko";
    }

    @Override
    public double preis() {
        return .20 + getränk.preis();
    }
}
