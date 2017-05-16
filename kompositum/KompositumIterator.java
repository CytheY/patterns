package kompositum;

import java.util.Iterator;
import java.util.Stack;

public class KompositumIterator implements Iterator {

    Stack<Iterator> stack = new Stack();
    public KompositumIterator(Iterator<SpeisekartenKomponente> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.peek();
            SpeisekartenKomponente komponente = (SpeisekartenKomponente) iterator.next();
            if(komponente instanceof Speisekarte){
                stack.push(komponente.erstelleIterator());
            }
            return komponente;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
