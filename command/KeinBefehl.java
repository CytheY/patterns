package command;

public class KeinBefehl implements Befehl {

    @Override
    public void ausführen() {
        System.out.println("No action assigned!");
    }
}
