package secao4;

import java.util.Scanner;

public class MinutosProblema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os minutos que você consumiu: ");
        int minutos = scanner.nextInt();
        double conta = 50;

        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2;
        }

        System.out.printf("Valor da conta = %.2f%n", conta);

    }
}
