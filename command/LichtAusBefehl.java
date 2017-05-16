package command;

public class LichtAusBefehl implements Befehl {

    Licht licht;

    public LichtAusBefehl(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausführen() {
        licht.aus();
    }
}
