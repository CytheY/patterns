package command;

public class StereoAnlage extends Controllable{

    public StereoAnlage(String place) {
        this.place = place;
    }

    public void setCD() {
    }

    public void setLautstärke(int i) {

    }

    @Override
    public void an() {
        System.out.println("Turned Sound on");
    }

    @Override
    public void aus() {
        System.out.println("Turned sound off");
    }
}
