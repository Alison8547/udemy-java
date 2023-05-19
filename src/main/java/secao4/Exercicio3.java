package secao4;

import java.util.Scanner;

public class Exercicio3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        int passwordValid = 2002;
        int passwordDigitado = scanner.nextInt();

        while (passwordDigitado != passwordValid) {
            System.out.println("Senha Inválida");
            passwordDigitado = scanner.nextInt();
        }

        System.out.println("Acesso permitido");
    }

    public static void ex2() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();
        }
    }

    public static void ex3() {
        int codigo = scanner.nextInt();
        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;

        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            }

            codigo = scanner.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
    }
}
