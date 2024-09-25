package exercise1;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("현재 월을 입력하세요: ");
        int month = scanner.nextInt();

        String season = "겨울";
        String a = "현재 계절은 %s입니다";

        switch(month){
            case 12: case 1: case 2:
                break;
            case 3: case 4: case 5:
                season = "봄";
                break;
            case 6: case 7: case 8:
                season = "여름";
                break;
            case 9: case 10: case 11:
                season = "가을";
                break;
            default:
                System.out.println("입력값이 잘못되었습니다.");
                return;
        }
        System.out.printf(a,season);
    }
}
