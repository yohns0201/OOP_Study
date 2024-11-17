package exercise1106.ex2;

public class Pencil extends Tool {
    public Pencil() {
        super();
    }
    public Pencil(int size, String color) {
        super(size, color);
    }
    @Override
    public void draw() {
        System.out.println("Pencil drawing with " + getToolColor() + " color and " + getToolSize() + " size");
    }
}
