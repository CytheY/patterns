package proxy;

public class KaugrummiAutomat {

    Zustand zustand = Zustand.READY;

    String standort;
    int anzahl;

    public KaugrummiAutomat(String standort, int anzahl) {
        this.anzahl = anzahl;
        this.standort = standort;
    }

    public Zustand getZustand(){
        return zustand;
    }

    public String getStandort() {
        return standort;
    }

    public int getAnzahl() {
        return anzahl;
    }
}
