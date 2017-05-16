package strategy;

public class NotQuaken implements QuakVerhalten {
    @Override
    public void quaken() {
        System.out.println("Kein Mucks!");
    }
}
