package beobachter;

import java.util.Observable;

public class WetterDaten extends Observable{

    private double temperatur;
    private double feuchtigkeit;
    private double luftdruck;

    public WetterDaten(){}


    public void messwerteGeändert(){
        setChanged();
        notifyObservers();
    }

    public void setMesswerte(double temp, double feucht, double druck){
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        this.luftdruck = druck;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public double getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public double getLuftdruck() {
        return luftdruck;
    }
}
