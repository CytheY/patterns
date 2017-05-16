package chainresponsibility;

public class Grossvater extends Dukatenesel {
    public Grossvater(Dukatenesel next) {
        this.next = next;
    }

    void gibGeld(){
        System.out.println("nichts der oma sagen!");
        super.gibGeld();
    }
}
