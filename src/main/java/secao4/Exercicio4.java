package secao4;

import java.util.Scanner;

public class Exercicio4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex7();
    }

    public static void ex1() {
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void ex2() {
        int counter = scanner.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < counter; i++) {
            int number = scanner.nextInt();

            if (number >= 10 && number <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);
    }

    public static void ex3() {
        int counter = scanner.nextInt();


        for (int i = 0; i < counter; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("%.1f%n", media);
        }
    }

    public static void ex4() {
        int counter = scanner.nextInt();


        for (int i = 0; i < counter; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                double result = a / b;

                System.out.printf("%.1f%n", result);
            }

        }
    }

    public static void ex5() {
        int counter = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= counter; i++) {
            factorial = factorial * i;

        }

        System.out.println(factorial);
    }

    public static void ex6() {
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }

    public static void ex7() {
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d%n", i, i * i, i * i * i);
        }

    }
}
