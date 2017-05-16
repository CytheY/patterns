package strategy;

public class NotFliegen implements FlugVerhalten {
    @Override
    public void fliegen() {
        System.out.println("Hebt nicht ab...");
    }
}
