package command;

public class StereoAnlageAnMitCD implements Befehl {

    StereoAnlage stereoAnlage;

    public StereoAnlageAnMitCD(StereoAnlage stereoAnlage) {
        this.stereoAnlage = stereoAnlage;
    }

    @Override
    public void ausführen() {
        stereoAnlage.an();
        stereoAnlage.setCD();
        stereoAnlage.setLautstärke(11);
    }
}
