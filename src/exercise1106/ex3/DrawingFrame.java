package exercise1106.ex3;

import java.util.ArrayList;

public class DrawingFrame {
    public void drawingTool(Tool tool){
        tool.draw();
    }
    public void erasingTool(Erase tool){tool.erase();}

    public static void main(String[] args) {
        DrawingFrame f = new DrawingFrame();

        Brush b1 = new Brush();
        Brush b2 = new Brush(3, "red");
        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil(5, "black");
        Crayon c1 = new Crayon();
        Crayon c2 = new Crayon(7, "blue");
        MechanicalPencil mp1 = new MechanicalPencil();


        ArrayList<Tool> toolList = new ArrayList<>();
        toolList.add(b1);
        toolList.add(b2);
        toolList.add(p1);
        toolList.add(p2);
        toolList.add(c1);
        toolList.add(c2);
        toolList.add(mp1);

        for(Tool tool : toolList){
            f.drawingTool(tool);
        }
        f.erasingTool(mp1);

    }
}
