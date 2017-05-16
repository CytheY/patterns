package state;

public class AusverkauftZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;

    public AusverkauftZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }

    @Override
    public void münzeEinwerfen() {
        System.out.println("Sie haben eine Münze eingeworfen");
        System.out.println(Util.redString("Automat ist Ausverkauft"));
        kaugummiAutomat.münzeAuswerfen();
    }

    @Override
    public void münzeAuswerfen() {
        System.out.println("Münze wird ausgeworfen.");
    }

    @Override
    public void griffDrehen() {
        System.out.println(Util.redString("Automat ist Ausverkauft"));
    }

    @Override
    public void kugelAusgeben() {

    }

    public String toString(){
        return "ausverkauft";
    }
}
