package besucher;

public interface Element {
    <ReturnType> ReturnType accept(Visitor<ReturnType> visitor);
}
