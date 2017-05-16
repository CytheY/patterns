package besucher;

public class Child implements Element {

    private String displayName;

    public Child(String displayName) {
        this.displayName = displayName;
    }

    public void walks(){
        System.out.println(displayName + " walks.");
    }

    @Override
    public <ReturnType> ReturnType accept(Visitor<ReturnType> visitor) {
        return visitor.visitChild(this);
    }
}
