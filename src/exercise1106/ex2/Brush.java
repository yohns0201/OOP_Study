package exercise1106.ex2;

public class Brush extends Tool{
    public Brush(){
        super();
    }
    public Brush(int size, String color){
        super(size, color);
    }
    @Override
    public void draw(){
        System.out.println("Brush drawing with "+getToolColor()+" color and "+getToolSize()+" size");
    }
}
