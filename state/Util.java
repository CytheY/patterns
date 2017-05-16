package state;

public class Util {
    public static String redString(String string){
        return (char)27 + "[31m" + string + (char)27 + "[0m";
    }
}
