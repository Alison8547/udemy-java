package secao4;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qualquer número: ");
        int number = scanner.nextInt();
        int counter = 0;

        while (number != 0) {
            counter++;
            System.out.println("Digite qualquer número: ");
            number = scanner.nextInt();
        }

        System.out.println("counter = " + counter);
    }
}
