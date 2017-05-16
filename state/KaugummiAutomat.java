package state;

public class KaugummiAutomat {
    Zustand ausverkauftZustand;
    Zustand keineMünzeZustand;
    Zustand hatMünzeZustand;
    Zustand verkauftZustand;
    Zustand gewinnZustand;

    Zustand zustand = ausverkauftZustand;
    int anzahl = 0;

    public KaugummiAutomat(int anzahl){
        ausverkauftZustand = new AusverkauftZustand(this);
        keineMünzeZustand = new KeineMuenzeZustand(this);
        hatMünzeZustand = new HatMuenzeZustand(this);
        verkauftZustand = new VerkauftZustand(this);
        gewinnZustand = new GewinnZustand(this);

        this.anzahl = anzahl;
        if(anzahl > 0){
            zustand = keineMünzeZustand;
        }
    }

    public int getAnzahl() {
        return anzahl;
    }

    public Zustand getZustand() {
        return zustand;
    }

    public Zustand getAusverkauftZustand() {
        return ausverkauftZustand;
    }

    public Zustand getKeineMünzeZustand() {
        return keineMünzeZustand;
    }

    public Zustand getHatMünzeZustand() {
        return hatMünzeZustand;
    }

    public Zustand getGewinnZustand() {
        return gewinnZustand;
    }

    public Zustand getVerkauftZustand() {
        return verkauftZustand;
    }

    public void setZustand(Zustand zustand) {
        this.zustand = zustand;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public void münzeEinwerfen(){
        zustand.münzeEinwerfen();
    }


    public void griffDrehen() {
        zustand.griffDrehen();
        zustand.kugelAusgeben();
    }

    public void münzeAuswerfen() {
        zustand.münzeAuswerfen();
    }

    public void auffüllen(int anzahl) {
        this.anzahl = anzahl;
        System.out.println(Util.redString("Kaugummi wurde aufgefüllt und enthält jetzt " + this.anzahl + " Kugeln."));
        zustand = keineMünzeZustand;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nKaukugel & Co KG");
        result.append("\nJava-gestützter Kaugummi-Standautomat Modell Nr. 2008/9\n");
        result.append("Bestand: " + anzahl + " Kaugummikugel");

        if (anzahl != 1) {
            result.append("n");
        }

        result.append("\nAutomat ");
        result.append(zustand.toString());

        return result.toString();
    }

    public void kugelFreigeben() {
        anzahl -= 1;
    }
}
