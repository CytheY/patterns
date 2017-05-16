package besucher;

public class KonkreteVisitor implements Visitor<Object> {

    @Override
    public Object visitChild(Child child) {
        child.walks();
        return null;
    }

    @Override
    public Object visitBike(Bike bike) {
        bike.drive();
        return null;
    }
}
