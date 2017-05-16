package command;

public class Licht extends Controllable {

    public Licht(String place) {
        this.place = place;
    }

    @Override
    public void an() {
        System.out.println("Turned light in "+ place+" on");
    }

    @Override
    public void aus() {
        System.out.println("Turned light off");
    }
}
