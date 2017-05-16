package strategy;

public abstract class Ente {
    QuakVerhalten quakVerhalten;
    FlugVerhalten flugVerhalten;

    abstract void anzeigen();


    public void tuQuaken(){
        quakVerhalten.quaken();
    }

    public void tuFliegen(){
        flugVerhalten.fliegen();
    }

}
