package exercise1106.ex3;

public class Brush implements Tool {
    private String toolColor;
    private int toolSize;

    public Brush(){
        this.toolSize = 1;
        this.toolColor = "white";
    }
    public Brush(int size, String color){
       this.toolSize = size;
       this.toolColor = color;
    }

    @Override
    public void draw(){
        System.out.println("Brush drawing with "+toolColor+" color and "+toolSize+" size");
    }
}
