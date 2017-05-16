package besucher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Visitor<Object> visitor = new KonkreteVisitor();
        ArrayList<Element> list = new ArrayList<>();

        list.add(new Child("C1"));
        list.add(new Child("C2"));
        list.add(new Child("C3"));
        list.add(new Bike("B1"));
        list.add(new Bike("B2"));
        list.add(new Bike("B3"));


        for(Element a : list){
            process(a, visitor);
        }
    }

    static void process(Element element, Visitor<Object> visitor){
        element.accept(visitor);
    }
}
