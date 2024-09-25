package exercise1;

import java.util.Scanner;

public class Comparison {
    public static int compare(int num1, int num2, int num3){
        return (num1 >= num2 && num1 >= num3)
                ? num1
                : (num2 >= num1 && num2 >= num3)
                ? num2
                : num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 1을 입력하세요: ");
        int n1 = scanner.nextInt();
        System.out.println("숫자 2를 입력하세요: ");
        int n2 = scanner.nextInt();
        System.out.println("숫자 3을 입력하세요: ");
        int n3 = scanner.nextInt();
        System.out.println("가장 큰 숫자는 "+compare(n1,n2,n3)+"입니다.");
    }

}
