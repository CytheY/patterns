package dekorierer;

public class SternbackKaffee {

    public static void main(String[] args){
        Getraenk getränk = new Espresso();

        System.out.println(getränk.getBeschreibung()
                            + " " +
                            getränk.preis()+ " €.");

//        dekorierer.Getraenk getränk2 = new DunkleRoestung();
        getränk = new Schoko(getränk);
        System.out.println(getränk.getBeschreibung()
                + " " +
                getränk.preis()+ " €.");
    }
}
