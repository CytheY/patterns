package strategy;

public class FliegtMitFluegeln implements FlugVerhalten {

    @Override
    public void fliegen() {
        System.out.println("Flug mit Flügeln.");
    }
}
