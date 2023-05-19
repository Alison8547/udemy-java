package secao4;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < counter; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.printf("Sum: %d%n", sum);
    }
}
