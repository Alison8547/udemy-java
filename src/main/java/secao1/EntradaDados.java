package secao1;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String digitado = scanner.next();

        System.out.println("Você digitou: " + digitado);

        double salario = scanner.nextDouble();

        System.out.println("Seu salário: $ " + salario);

        String nome = scanner.next();
        int idade = scanner.nextInt();
        double peso = scanner.nextDouble();

        System.out.printf("Nome: %s%nIdade: %d%nPeso: %.1f%n",nome,idade,peso);

        scanner.close();
    }
}
