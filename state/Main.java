package state;

public class Main {
    public static void main(String[] args){
        KaugummiAutomat kaugummiAutomat = new KaugummiAutomat(2);

        System.out.println(kaugummiAutomat);

        kaugummiAutomat.münzeEinwerfen();
        kaugummiAutomat.griffDrehen();

        kaugummiAutomat.münzeAuswerfen();
//
//        System.out.println(kaugummiAutomat);
//        kaugummiAutomat.münzeEinwerfen();
//        kaugummiAutomat.griffDrehen();
//
        kaugummiAutomat.auffüllen(1);
//
        kaugummiAutomat.münzeEinwerfen();
        kaugummiAutomat.griffDrehen();
//
        kaugummiAutomat.münzeEinwerfen();
        kaugummiAutomat.griffDrehen();



    }
}
