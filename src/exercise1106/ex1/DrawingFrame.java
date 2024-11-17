package exercise1106.ex1;

import java.util.ArrayList;

public class DrawingFrame {
    public void drawingBrush(Brush b){
        b.draw();
    }
    public void drawingPencil(Pencil p){
        p.draw();
    }
    public void drawingCrayon(Crayon c){
        c.draw();
    }

    public static void main(String[] args) {
        DrawingFrame f = new DrawingFrame();

        Brush b1 = new Brush();
        Brush b2 = new Brush(3, "red");

        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil(5, "black");

        Crayon c1 = new Crayon();
        Crayon c2 = new Crayon(7, "blue");

        ArrayList<Brush> brushList = new ArrayList<>();
        brushList.add(b1);
        brushList.add(b2);

        ArrayList<Pencil> pencilList = new ArrayList<>();
        pencilList.add(p1);
        pencilList.add(p2);

        ArrayList<Crayon> crayonList = new ArrayList<>();
        crayonList.add(c1);
        crayonList.add(c2);

        for (Brush brush : brushList) {
            f.drawingBrush(brush);
        }
        for(Pencil pencil : pencilList){
            f.drawingPencil(pencil);
        }
        for(Crayon crayon : crayonList){
            f.drawingCrayon(crayon);
        }
    }
}
