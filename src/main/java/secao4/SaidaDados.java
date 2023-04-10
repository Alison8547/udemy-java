package secao4;

import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        System.out.println("Bom dia!");
        double x = 10.2352;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f Metros%n", x);

        String nome = "Alison";
        int idade = 18;
        double renda = 2200.0;

        System.out.printf("%s tem %d anos e sua renda é: %.2f%n", nome, idade, renda);

    }
}
