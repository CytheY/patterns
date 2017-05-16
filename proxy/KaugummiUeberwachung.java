package proxy;

public class KaugummiUeberwachung {
    KaugrummiAutomat automat;

    public KaugummiUeberwachung(KaugrummiAutomat automat) {
        this.automat = automat;
    }

    public void berichten(){
        System.out.println("Kaugummiautomat: " +
                            automat.getStandort());
        System.out.println("Aktueller Bestand: " + automat.getAnzahl());
        System.out.println("Aktueller Zustand: " + automat.getZustand());
    }
}

