package exerciseWeek4;

import java.util.Scanner;

public class Point {
    int x;
    int y;

    //기본 생성자
    public Point(){
        x = 0;
        y = 0;
    };
    //매개 변수 있는 생성자
    public Point(int a, int b){
        x = a;
        y = b;
    }
    //거리 계산 하는 함수
    public double distance(Point p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //첫번째 점
        System.out.println("첫번째 점의 x좌표: ");
        int p1x = scanner.nextInt();
        System.out.println("첫번째 점의 y좌표: ");
        int p1y = scanner.nextInt();
        Point p1 = new Point(p1x,p1y);

        //두번째 점
        System.out.println("두번째 점의 x좌표: ");
        int p2x = scanner.nextInt();
        System.out.println("두번째 점의 y좌표: ");
        int p2y = scanner.nextInt();
        Point p2 = new Point(p2x, p2y);

        //원점
        Point p0 = new Point();

        //각 두 점 사이의 거리 계산
        double d1 = p1.distance(p2);//p1 vs p2
        double d2 = p1.distance(p0);//p1 vs p0
        double d3 = p2.distance(p0);//p2 vs p0

        //d1과 d2 비교 후, 작은 값과 다시 d3을 비교, 결과 가장 짧은 거리 계산
        double minDistance = Math.min(Math.min(d1, d2), d3);

        // 결과 출력
        System.out.println("p1과 p2의 거리: " + d1);
        System.out.println("p1과 원점과의 거리: " + d2);
        System.out.println("p2와 원점과의 거리: " + d3);
        System.out.println("가장 가까운 점 끼리의 거리: " + minDistance);
    }
}
