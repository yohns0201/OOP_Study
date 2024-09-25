package exerciseWeek3;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("ALL")


public class ex3 {
    public static int sum(int n, int m){
        return n+m;
    }
    public static int sub(int n, int m){
        return n-m;
    }
    public static int mul(int n, int m){
        return n*m;
    }
    public static int div(int n, int m){
        return n/m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        try {
            System.out.println("첫번째 값: ");
            n1 = scanner.nextInt();
            System.out.println("두번째 값: ");
            n2 = scanner.nextInt();
            System.out.println(n1 + " + " + n2 + " = " + sum(n1, n2));
            System.out.println(n1 + " - " + n2 + " = " + sub(n1, n2));
            System.out.println(n1 + " * " + n2 + " = " + mul(n1, n2));
            System.out.println(n1 + " / " + n2 + " = " + div(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다!");
            main(args);
        }
        catch(InputMismatchException e) {
            System.out.println("정수를 입력해주세요!");
            main(args);
        }
    }
}
