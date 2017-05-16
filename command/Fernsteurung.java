package command;

public class Fernsteurung {
    Befehl [] anBefehle;
    Befehl [] ausBefehle;

    public Fernsteurung() {
        anBefehle = new Befehl[7];
        ausBefehle = new Befehl[7];

        Befehl keinBefehl = new KeinBefehl();

        for (int i = 0; i < 7; i++) {
            anBefehle[i] = keinBefehl;
            ausBefehle[i] = keinBefehl;
        }
    }

    public void setBefehl(int platz, Befehl anBefehl, Befehl ausBefehl){
        anBefehle[platz] = anBefehl;
        ausBefehle[platz] = ausBefehl;
    }

    public void anKnopfWurdeGedrückt(int index){
        anBefehle[index].ausführen();
    }

    public void ausKnopfWurdeGedrückt(int index){
        ausBefehle[index].ausführen();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Fernsteuerung -------\n");
        for (int i = 0; i < anBefehle.length; i++) {
            stringBuff.append("[Platz " + i + "] "
            + anBefehle[i].getClass().getName() + " "
            + ausBefehle[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
