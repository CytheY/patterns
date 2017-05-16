package Iterator;

public class Main {
    public static void main(String[] args){
        PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte = new PfannkuchenhausSpeisekarte();
        RestaurantSpeisekarte restaurantSpeisekarte = new RestaurantSpeisekarte();
        CafeSpeisekarte cafeSpeisekarte = new CafeSpeisekarte();

        Kellnerin kellnerin = new Kellnerin();

        kellnerin.addSpeisekarte(pfannkuchenhausSpeisekarte);
        kellnerin.addSpeisekarte(restaurantSpeisekarte);
        kellnerin.addSpeisekarte(cafeSpeisekarte);

        kellnerin.speisekarteAusgeben();
    }
}
