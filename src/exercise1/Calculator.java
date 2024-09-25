package exercise1;

import java.util.Scanner;

public class Calculator {
    public static float sum(float n, float m){
       return n+m;
    }
    public static float sub(float n, float m){
        return n-m;
    }
    public static float mul(float n, float m){
        return n*m;
    }
    public static float div(float n, float m){
        return n/m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 값: ");
        float n1 = scanner.nextFloat();
        System.out.println("두번째 값: ");
        float n2 = scanner.nextFloat();
        System.out.println(n1 + " + " + n2 + " = " + sum(n1,n2));
        System.out.println(n1 + " - " + n2 + " = " + sub(n1,n2));
        System.out.println(n1 + " * " + n2 + " = " + mul(n1,n2));
        System.out.println(n1 + " / " + n2 + " = " + div(n1,n2));
    }
}

