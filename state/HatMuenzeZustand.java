package state;

import java.util.Random;

public class HatMuenzeZustand implements Zustand {
    Random randomGewinn = new Random(System.currentTimeMillis());
    KaugummiAutomat kaugummiAutomat;

    public HatMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
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
        System.out.println("Sie haben den Griff gedreht...");
        int gewinn = 0;//randomGewinn.nextInt(10);
        if((gewinn == 0) && (kaugummiAutomat.getAnzahl() > 1)){
            kaugummiAutomat.setZustand(kaugummiAutomat.getGewinnZustand());
        } else {
            kaugummiAutomat.setZustand(kaugummiAutomat.getVerkauftZustand());
        }
    }

    @Override
    public void kugelAusgeben() {

    }

    public String toString(){
        return "bereit für Drehen des Griffs";
    }
}
