package strategy;

public class LockEnte extends Ente {

    public LockEnte() {
        quakVerhalten = new NotQuaken();
        flugVerhalten = new NotFliegen();
    }

    @Override
    void anzeigen() {
        System.out.println("Ich bin eine LockEnte");
    }
}
