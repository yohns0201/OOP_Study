package exerciseWeek3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 1000, 100, 10, 1};
        Scanner scanner = new Scanner(System.in);

        System.out.println("금액를 입력하세요: ");
        int n = scanner.nextInt();

        for (int j : unit) {
            int a = n / j;
            n = n % j;
            if (j>100){
                System.out.println(j+"원 권: "+ a + "장");
            }
            else{
                System.out.println(j+"원 동전: "+ a + "개");
            }
        }
    }
}
