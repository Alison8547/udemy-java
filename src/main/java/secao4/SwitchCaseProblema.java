package secao4;

import java.util.Scanner;

public class SwitchCaseProblema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 = Domingo | 2 = Segunda | 3 = Terça | 4 = Quarta | 5 = Quinta | 6 = Sexta | 7 = Sábado");
        int escolha = scanner.nextInt();
        String dia = "";

        switch (escolha) {
            case 1 -> {
                dia = "Domingo";
            }
            case 2 -> {
                dia = "Segunda";
            }
            case 3 -> {
                dia = "Terça";
            }
            case 4 -> {
                dia = "Quarta";
            }
            case 5 -> {
                dia = "Quinta";
            }
            case 6 -> {
                dia = "Sexta";
            }
            case 7 -> {
                dia = "Sabádo";
            }
            default -> {
                System.out.println("Valor inválido!");
            }

        }
        if (escolha > 0 && escolha <= 7) {
            System.out.printf("Dia da semana = %s%n", dia);
        }
    }
}
