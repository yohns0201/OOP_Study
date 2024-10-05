package exerciseWeek4;
import java.io.*;
import java.util.*;

public class Figure {
    String name;
    double radius;
    double length;
    double width;
    double area;

    public Figure(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public Figure(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public void getArea(double radius) {
        this.area = radius * radius * 3.14;
    }
    public void getArea(double length, double width) {
        this.area = length * width;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Figure[] f = new Figure[4];

        System.out.println("도형과 수치 입력: ");
        for(int i = 0; i < f.length; i++){
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            if(parts[0].equalsIgnoreCase("Circle")){
                f[i] = new Figure(parts[0], Double.parseDouble(parts[1]));
                f[i].getArea(Double.parseDouble(parts[1]));
            }
            else if(parts[0].equalsIgnoreCase("Rectangle")){
                f[i] = new Figure(  parts[0],
                                    Double.parseDouble(parts[1]),
                                    Double.parseDouble(parts[2]));
                f[i].getArea(   Double.parseDouble(parts[1]),
                                Double.parseDouble(parts[2]));
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        for(int i = 0; i < f.length; i++){
            System.out.printf("%s의 넓이: %.2f\n", f[i].name, f[i].area);
        }
    }
}
