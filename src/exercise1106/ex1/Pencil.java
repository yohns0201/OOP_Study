package exercise1106.ex1;

public class Pencil {
    private String pencilColor;
    private int pencilSize;
    public Pencil(){
        setColor("white");
        setSize(1);
    }
    public Pencil(int size, String color){
        setColor(color);
        setSize(size);
    }
    public void setColor(String color){
        pencilColor = color;
    }
    public void setSize(int thickness){
        pencilSize = thickness;
    }
    public void draw(){
        System.out.println("Pencil drawing with a "+pencilColor+" color and "+pencilSize+" size");
    }
}
