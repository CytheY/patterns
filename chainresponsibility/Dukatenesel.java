package chainresponsibility;

public class Dukatenesel {
    protected Dukatenesel next;

    void gibGeld(){
        if(next != null){
            next.gibGeld();
        } else {
            System.out.println("TRÖTT");
        }
    }
}
