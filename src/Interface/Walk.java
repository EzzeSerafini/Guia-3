package Interface;

public interface Walk {
    public default void walk() {
        System.out.println("I'm walking");
    }
}
