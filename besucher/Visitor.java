package besucher;

public interface Visitor<ReturnType> {
    ReturnType visitChild(Child child);
    ReturnType visitBike(Bike bike);
}
