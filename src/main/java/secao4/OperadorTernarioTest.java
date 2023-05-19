package secao4;

import java.util.Scanner;

public class OperadorTernarioTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();

        System.out.printf("Você é %s%n", idade >= 18 ? "maior de idade" : "menor de idade");
    }
}
