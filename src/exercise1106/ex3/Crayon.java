package exercise1106.ex3;

public class Crayon implements Tool {
    private String toolColor;
    private int toolSize;

    public Crayon(){
        this.toolSize = 1;
        this.toolColor = "white";
    }
    public Crayon(int size, String color){
       this.toolSize = size;
       this.toolColor = color;
    }

    @Override
    public void draw(){
        System.out.println("Crayon drawing with "+toolColor+" color and "+toolSize+" size");
    }
}
