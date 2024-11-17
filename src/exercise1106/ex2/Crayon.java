package exercise1106.ex2;

public class Crayon extends Tool {
    public Crayon() {
        super();
    }

    public Crayon(int size, String color) {
        super(size, color);
    }

    @Override
    public void draw() {
        System.out.println("Crayon drawing with " + getToolColor() + " color and " + getToolSize() + " size");
    }
}
