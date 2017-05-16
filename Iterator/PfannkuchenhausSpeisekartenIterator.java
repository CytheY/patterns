//package Iterator;
//
//import java.util.*;
//
//public class PfannkuchenhausSpeisekartenIterator implements java.util.Iterator {
//
//    ArrayList elemente;
//    int position = 0;
//
//    public PfannkuchenhausSpeisekartenIterator(ArrayList elemente) {
//        this.elemente = elemente;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if(position >= elemente.size()){
//            return false;
//        }else{
//            return true;
//        }
//    }
//
//    @Override
//    public Object next() {
//        Object objekt = elemente.get(position);
//        position = position + 1;
//        return objekt;
//    }
//
//    @Override
//    public void remove() {
//        if (position <= 0) {
//            throw new IllegalStateException
//                    ("Es kann kein Element entfernt werden, bevor Sie nicht mindestens einmal next() aufgerufen haben");
//        }
//        if (elemente.get(position-1) != null) {
//            for (int i = position-1; i <
//                    (elemente.size()-1); i++) {
//                elemente.set(i,elemente.get(i+1));
//            }
//            elemente.set(elemente.size() -1,null );
//        }
//    }
//}
