package state;

public class KeineMuenzeZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;

    public KeineMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }

    @Override
    public void münzeEinwerfen() {
        System.out.println("Sie haben eine Münze eingeworfen");
        kaugummiAutomat.setZustand(kaugummiAutomat.getHatMünzeZustand());
    }

    @Override
    public void münzeAuswerfen() {
        System.out.println("Sie haben keine Münze eingeworfen");
    }

    @Override
    public void griffDrehen() {
        System.out.println("Sie haben gedreht, aber es ist keine Münze da");
    }

    @Override
    public void kugelAusgeben() {
        System.out.println("Sie müssen zuerst bezahlen");
    }

    public String toString(){
        return "bereit für Münzeinwurf";
    }

}
