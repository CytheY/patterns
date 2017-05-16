package fabrik;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String teig;
    String sosse;
    ArrayList belaege = new ArrayList();

    public String getName() {
        return name;
    }

    public void vorbereiten() {
        System.out.println("Bereite " + name);
        System.out.println("Werfe Teig ...");
        System.out.println("Füge Soße hinzu...");
        System.out.println("Füge Beläge hinzu: ");
        for (int i = 0; i < belaege.size(); i++) {
            System.out.println(" " + belaege.get(i));
        }
    }

    public void backen() {
        System.out.println("Backe 25 Minuten bei 350");
    }

    public void schneiden() {
        System.out.println ("Schneide die Pizza diagonal in Stücke");
    }

    public void verpacken() {
        System.out.println
                ("Packe die Pizza in die offizielle Pizzeria-Schachtel");
    }

    public String toString(){
        StringBuffer anzeige = new StringBuffer();
        anzeige.append("---- " + name + " ----\n");
        anzeige.append(teig + "\n");
        anzeige.append(sosse + "\n");
        for (int i = 0; i < belaege.size(); i++) {
            anzeige.append(belaege.get(i) + "\n");
        }
        return anzeige.toString();
    }
}
