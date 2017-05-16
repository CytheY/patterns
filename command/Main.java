package command;

public class Main {
    public static void main(String[] args){
        Fernsteurung fernsteurung = new Fernsteurung();

        Licht wohnZimmer = new Licht("Wohnzimmer");
//        Licht küchenBeleuchtung = new Licht("Küche");

//        Ventilator ventilator = new Ventilator("Wohnzimmer");
//        GaragenTor garanTor = new GaragenTor("");
//        StereoAnlage stereoAnlage = new StereoAnlage("Wohnzimmer");

        LichtAnBefehl wohnzimmerAn = new LichtAnBefehl(wohnZimmer);
        LichtAusBefehl wohnzimmerAus = new LichtAusBefehl(wohnZimmer);

        fernsteurung.setBefehl(0, wohnzimmerAn, wohnzimmerAus);

        System.out.println(fernsteurung);

        fernsteurung.anKnopfWurdeGedrückt(0);
        fernsteurung.ausKnopfWurdeGedrückt(0);

    }
}
