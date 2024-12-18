package exercise1106.ex2;

import java.util.ArrayList;

public class DrawingFrame {
    public void drawingTool(Tool tool){
        tool.draw();
    }

    public static void main(String[] args) {
        DrawingFrame f = new DrawingFrame();

        Brush b1 = new Brush();
        Brush b2 = new Brush(3, "red");

        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil(5, "black");

        Crayon c1 = new Crayon();
        Crayon c2 = new Crayon(7, "blue");

        ArrayList<Tool> toolList = new ArrayList<>();
        toolList.add(b1);
        toolList.add(b2);
        toolList.add(p1);
        toolList.add(p2);
        toolList.add(c1);
        toolList.add(c2);

        for(Tool tool : toolList){
            f.drawingTool(tool);
        }
    }
}
