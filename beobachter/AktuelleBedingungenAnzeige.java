package beobachter;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class AktuelleBedingungenAnzeige implements Observer, AnzeigeElement {

    private final Observable observable;
    private Thread inputThread;
    private Controller controller;
    private double temperatur;
    private double feuchtigkeit;
    private double druck;

    public AktuelleBedingungenAnzeige(Controller controller, Observable observable) {
        this.controller = controller;
        this.inputThread = new Thread(new TextInput(controller));

        this.observable = observable;
        observable.addObserver(this);

        this.inputThread.start();

    }

    @Override
    public void anzeigen() {
//        System.out.printf("Aktuelle Bedingungen: " + temperatur + " Grad C und " + feuchtigkeit + "% Luftfeuchtigkeit.");
        System.out.println("Aktuelle Bedingungen:");
        System.out.println("Temperatur: " + temperatur);
        System.out.println("Luftfeuchtigkeit: " + feuchtigkeit);
        System.out.println("Druck: " + druck);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WetterDaten){
            WetterDaten wetterDaten = (WetterDaten) o;
            this.temperatur = wetterDaten.getTemperatur();
            this.feuchtigkeit = wetterDaten.getFeuchtigkeit();
            this.druck = wetterDaten.getLuftdruck();
            anzeigen();
        }
    }

    public void getWetterData(){
        System.out.println("Setzen sie die WetterDaten");
    }


    private class TextInput implements Runnable {

        private Scanner scan;
        private Controller contr;

        public TextInput(Controller contr)  {
            this.contr = contr;
            scan = new Scanner(System.in);
        }

        public void run() {
            while (true) {
                int input = scan.nextInt();

                switch (contr.getState()) {
                    case INPUT:
                        break;
                    case OUTPUT:
                        break;
                    default:
                        break;
                }
            }
        }

    }


}
