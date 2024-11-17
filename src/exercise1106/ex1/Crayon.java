package exercise1106.ex1;

public class Crayon {
    private String crayonColor;
    private int crayonSize;

    public Crayon(){
        setColor("white");
        setSize(1);
    }
    public Crayon(int size,String color){
        setColor(color);
        setSize(size);
    }
    public void setColor(String color){
        crayonColor = color;
    }
    public void setSize(int thickness){
        crayonSize = thickness;
    }
    public void draw(){
        System.out.println("Crayon drawing with a "+crayonColor+" color and "+crayonSize+" size");
    }
}
