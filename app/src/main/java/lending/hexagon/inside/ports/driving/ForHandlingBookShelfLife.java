package lending.hexagon.inside.ports.driving;

public interface ForHandlingBookShelfLife {
    void increaseAvailable(int numberOfBooks, String isbn);
    void decreaseAvailable(int numberOfBooks, String isbn);
}
