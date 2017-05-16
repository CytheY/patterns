package state;

public class GewinnZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;

    public GewinnZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }

    @Override
    public void münzeEinwerfen() {

    }

    @Override
    public void münzeAuswerfen() {

    }

    @Override
    public void griffDrehen() {

    }

    @Override
    public void kugelAusgeben() {
        System.out.println("SIE HABEN GEWONNEN! Sie bekommen zwei Kugeln für Ihr Geld");
        kaugummiAutomat.kugelFreigeben();
        if(kaugummiAutomat.getAnzahl() == 0){
            kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
        } else {
            kaugummiAutomat.kugelFreigeben();
            if(kaugummiAutomat.getAnzahl() > 0){
                kaugummiAutomat.setZustand(kaugummiAutomat.getKeineMünzeZustand());
            } else {
                kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
            }
        }
    }
}
