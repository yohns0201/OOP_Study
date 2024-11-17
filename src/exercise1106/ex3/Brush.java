package exercise1106.ex3;

public class Brush implements Tool {
    private int toolSize;
    private String toolColor;

    // 기본 생성자
    public Brush() {
        this.toolSize = 1;
        this.toolColor = "white";
    }

    // 매개변수 있는 생성자
    public Brush(int size, String color) {
        this.toolSize = size;
        this.toolColor = color;
    }

    // draw 메서드 구현
    @Override
    public void draw() {
        System.out.println("Brush drawing with " + getToolColor() + " color and " + getToolSize() + " size");
    }

    // getToolSize 메서드 구현
    @Override
    public int getToolSize() {
        return toolSize;
    }

    // getToolColor 메서드 구현
    @Override
    public String getToolColor() {
        return toolColor;
    }
}
