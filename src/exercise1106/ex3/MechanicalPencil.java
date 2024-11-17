package exercise1106.ex3;

public class MechanicalPencil implements Tool, Erase {
    private int toolSize;
    private String toolColor;

    public MechanicalPencil() {
        this.toolSize = 1;
        this.toolColor = "white";
    }

    public MechanicalPencil(int size, String color) {
        this.toolSize = size;
        this.toolColor = color;
    }

    @Override
    public void draw() {
        System.out.println("MechanicalPencil drawing with " + toolColor + " color and " + toolSize + " size");
    }

    @Override
    public void erase() {
        System.out.println("MechanicalPencil erasing with " + toolColor + " color and " + toolSize + " size");
    }

    @Override
    public int getToolSize() {
        return toolSize;
    }

    @Override
    public String getToolColor() {
        return toolColor;
    }
}