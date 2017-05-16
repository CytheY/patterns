package state;

public class VerkauftZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;

    public VerkauftZustand(KaugummiAutomat kaugummiAutomat) {
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
        System.out.println("Kugel wird ausgegeben.");
        kaugummiAutomat.kugelFreigeben();
//        kaugummiAutomat.setAnzahl(kaugummiAutomat.getAnzahl() - 1);

        if (kaugummiAutomat.getAnzahl() == 0) {
            kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
        } else {
            kaugummiAutomat.setZustand(kaugummiAutomat.getKeineMünzeZustand());
        }
    }

    public String toString(){
        return "gibt Kugel aus";
    }
}
