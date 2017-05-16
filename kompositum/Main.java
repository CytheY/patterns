package kompositum;

public class Main {
    public static void main(String[] args){
        Speisekarte speisekarte = new Speisekarte("K9", "Warme Speisen");

        SpeisekartenKomponente speise = new Speise("Knödel","mit Soß", true, 3.00);

        speisekarte.hinzufügen(speise);

        Kellnerin kellnerin = new Kellnerin(speisekarte);

        kellnerin.vegetarischeSpeisekarteAusgeben();

    }
}
