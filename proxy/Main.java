package proxy;

public class Main {
    public static void main(String[] args){
        int anzahl = 0;
        if(args.length < 2){
            System.out.println("<Name> <Bestand> des Automaten");
            System.exit(1);
        }

        try{
            anzahl = Integer.parseInt(args[1]);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        KaugrummiAutomat automat = new KaugrummiAutomat(args[0], anzahl);
        KaugummiUeberwachung ueberwachung = new KaugummiUeberwachung(automat);

        ueberwachung.berichten();
    }
}
