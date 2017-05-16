package chainresponsibility;

public class Erbtante extends Dukatenesel {
    public Erbtante(Dukatenesel next) {
        this.next = next;
    }

    void gibGeld(){
        System.out.println("Mein Neffe soll Alleinerbe sein!");
        super.gibGeld();
    }
}
