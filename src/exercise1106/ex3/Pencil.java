package exercise1106.ex3;

public class Pencil implements Tool {
    private String toolColor;
    private int toolSize;

    public Pencil(){
        this.toolSize = 1;
        this.toolColor = "white";
    }
    public Pencil(int size, String color){
       this.toolSize = size;
       this.toolColor = color;
    }

    @Override
    public void draw(){
        System.out.println("Pencil drawing with "+toolColor+" color and "+toolSize+" size");
    }
}
