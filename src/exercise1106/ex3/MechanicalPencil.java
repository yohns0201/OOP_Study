package exercise1106.ex3;

public class MechanicalPencil implements Tool,Erase {

    public MechanicalPencil() {

    }

    @Override
    public void erase(){
        System.out.println("Mechanical Pencil has erased");
    }
    @Override
    public void draw(){
        System.out.println("Mechanical Pencil has drawn");
    }
}
