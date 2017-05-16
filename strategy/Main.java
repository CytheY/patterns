package strategy;

public class Main {
    public static void main(String[] args){
        Ente stockEnte = new StockEnte();
        stockEnte.anzeigen();
        stockEnte.tuFliegen();
        stockEnte.tuQuaken();

        Ente lockEnte = new LockEnte();
        lockEnte.anzeigen();
        lockEnte.tuFliegen();
        lockEnte.tuQuaken();
    }
}
