package exercise1106.ex1;

public class Brush {
    private String brushColor;
    private int brushSize;

    public Brush(){
        setColor("white");
        setSize(1);
    }

    private void setSize(int thickness) {
        brushSize = thickness;
    }

    private void setColor(String color) {
        brushColor = color;
    }

    public Brush(int size, String color){
        setColor(color);
        setSize(size);
    }
    public void draw(){
        System.out.println("Brush drawing with a "+brushColor+" color and "+brushSize+" size");
    }
}
