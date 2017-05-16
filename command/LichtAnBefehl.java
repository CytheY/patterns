package command;

public class LichtAnBefehl implements Befehl {

    Licht licht;

    public LichtAnBefehl(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausführen() {
        licht.an();
    }
}
