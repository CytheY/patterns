package singleton;

public class Singleton {
    private static Singleton instance;
    private static final Object classlock = Singleton.class;

    private Singleton() {}

    public static Singleton getInstance(){
        synchronized (classlock){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }
}
