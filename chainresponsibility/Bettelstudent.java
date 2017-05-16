package chainresponsibility;

public class Bettelstudent {
    public static void main(String[] args){
        Dukatenesel et = new Erbtante(null);
        Dukatenesel opa = new Grossvater(et);
        Dukatenesel papi = new Vater(opa);

        papi.gibGeld();
    }
}
