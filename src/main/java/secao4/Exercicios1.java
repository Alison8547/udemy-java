package secao4;

import java.util.Scanner;

public class Exercicios1 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex6();
    }

    public static void ex1() {
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.printf("SOMA = %d%n", sum);
    }

    public static void ex2() {
        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);

    }

    public static void ex3() {
        System.out.println("Digite 4 números seperados por espaço: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diferenca = a * b - c * d;

        System.out.printf("DIFERENCA = %d%n", diferenca);

    }

    public static void ex4() {
        System.out.println("Digite seu número: ");
        int numero = scanner.nextInt();
        System.out.println("Digite sua hora trabalhada: ");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.println("Digite quanto você ganha por hora: ");
        double valorHora = scanner.nextDouble();

        double salary = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numero, salary);
    }

    public static void ex5() {
        double[][] peca = new double[2][3];


        for (int i = 1; i <= 2; i++) {
            System.out.printf("Digite os valores da peça %d%n", i);
            peca[i - 1][0] = scanner.nextDouble();
            peca[i - 1][1] = scanner.nextDouble();
            peca[i - 1][2] = scanner.nextDouble();
        }

        double result = (peca[0][2] * peca[0][1]) + (peca[1][2] * peca[1][1]);

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", result);

    }

    public static void ex6() {
        System.out.println("Digite 3 valores: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double triangulo = a * c / 2;
        double circulo = Math.PI * Math.pow(c, 2);
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO = %.3f%nCIRCULO = %.3f%nTRAPEZIO = %.3f%nQUADRADO = %.3f%nRETANGULO = %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);


    }
}
