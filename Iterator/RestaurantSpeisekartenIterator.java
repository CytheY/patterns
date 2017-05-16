package Iterator;

import java.util.*;

public class RestaurantSpeisekartenIterator implements java.util.Iterator {

    int position = 0;
    Speise[] elemente;

    public RestaurantSpeisekartenIterator(Speise[] speisen) {
        this.elemente = speisen;
    }

    @Override
    public boolean hasNext() {
        if (position >= elemente.length) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object objekt = elemente[position];
        position = position + 1;
        return objekt;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("Es kann kein Element entfernt werden, bevor Sie nicht mindestens einmal next() aufgerufen haben");
        }
        if (elemente[position-1] != null) {
            for (int i = position-1; i <
                    (elemente.length-1); i++) {
                elemente[i] = elemente[i+1];
            }
            elemente[elemente.length-1] = null;
        }
    }
}
