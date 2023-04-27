package secao4;

import java.util.Scanner;

public class Exercicios2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex8();
    }

    public static void ex1() {
        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }

    public static void ex2() {
        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }

    public static void ex3() {
        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }

    public static void ex4() {
        System.out.println("Digite a hora inicial do jogo:");
        int horaInicial = scanner.nextInt();
        System.out.println("Digite a hora final do jogo:");
        int horaFinal = scanner.nextInt();
        int duracao;

        if (horaInicial >= horaFinal) {
            duracao = (24 - horaInicial) + horaFinal;
        } else {
            duracao = horaFinal - horaInicial;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
    }

    public static void ex5() {
        System.out.println("Digite o código do item:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade do item:");
        int quantidade = scanner.nextInt();
        double price = 0;
        switch (codigo) {
            case 1 -> {
                price = 4.00d * quantidade;
            }
            case 2 -> {
                price = 4.50d * quantidade;
            }
            case 3 -> {
                price = 5.00d * quantidade;
            }
            case 4 -> {
                price = 2.00d * quantidade;
            }
            case 5 -> {
                price = 1.50d * quantidade;
            }
            default -> {
                System.out.println("Valor invalido!");
            }
        }

        System.out.printf("Total: R$ %.2f%n", price);
    }

    public static void ex6() {
        System.out.println("Digite qualquer valor:");
        double valor = scanner.nextDouble();

        if (valor > 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo [50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }
    }

    public static void ex7() {
        System.out.println("Digite valor 1:");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite valor 2:");
        double valor2 = scanner.nextDouble();

        if (valor1 == 0.0 && valor2 == 0.0) {
            System.out.println("Origem");
        } else if (valor1 == 0.0) {
            System.out.println("Eixo Y");
        } else if (valor2 == 0.0) {
            System.out.println("Eixo X");
        } else if (valor1 > 0.0 && valor2 > 0.0) {
            System.out.println("Q1");
        } else if (valor1 < 0.0 && valor2 > 0.0) {
            System.out.println("Q2");
        } else if (valor1 < 0.0 && valor2 < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }

    public static void ex8() {
        System.out.println("Digite o valor do seu salário:");
        double valor = scanner.nextDouble();
        double imposto = 0;
        if (valor <= 2000.0d) {
            System.out.println("Isento");
        } else if (valor == 3002.0) {
            imposto = (1000 * 8 / 100.0) + (2 * 18 / 100.0);
        } else if (valor > 2000.0 && valor <= 3000.0d) {
            imposto = (valor - 2000.0) * 8 / 100.0;
        } else if (valor > 3000.0d && valor <= 4500.0d) {
            imposto = (valor - 3000.0) * 18 / 100.0 + 1000 * 8 / 100.0;
        } else {
            imposto = (valor - 4500.0) * 28 / 100.0 + 1500 * 18 / 100.0 + 1000 * 8 / 100.0;
        }
        System.out.printf("R$ %.2f%n", imposto);
    }
}
