package besucher;

public class Bike implements Element {

    private String displayName;

    public Bike(String displayName) {
        this.displayName = displayName;
    }

    public void drive(){
        System.out.println(displayName + " drives.");
    }

    @Override
    public <ReturnType> ReturnType accept(Visitor<ReturnType> visitor) {
        return visitor.visitBike(this);
    }
}
