package beobachter;

import java.util.Observable;

public class Controller extends Observable{

    public enum STATE{
        INPUT,
        OUTPUT
    }
    WetterDaten wetterDaten;
    AnzeigeElement anzeigeElement;

    STATE state;

    public Controller() {
        this.wetterDaten = new WetterDaten();
        this.anzeigeElement = new AktuelleBedingungenAnzeige(this, wetterDaten);
        state = STATE.OUTPUT;
    }

    public void start(){
        wetterDaten.setMesswerte(20,50,1024);
        wetterDaten.messwerteGeändert();

        state = STATE.INPUT;
        anzeigeElement.getWetterData();
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }
}
