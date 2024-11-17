package exercise1106.ex2;

public abstract class Tool {
    private String toolColor;
    private int toolSize;

    public Tool(){
        this.toolSize = 1;
        this.toolColor = "white";
    }
    public Tool(int size, String color){
        this.toolColor = color;
        this.toolSize = size;
    }

    public abstract void draw();

    public int getToolSize(){
        return toolSize;
    }
    public String getToolColor(){
        return toolColor;
    }
}


