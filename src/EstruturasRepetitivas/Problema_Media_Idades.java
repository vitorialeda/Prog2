package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Problema_Media_Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double idade;
        double soma = 0;
        double cont = 0;

        System.out.println("Digite as idades:");
        idade = sc.nextDouble();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            while (idade > 0) {
                soma += idade;
                cont++;
                System.out.println("Digite as idades:");
                idade = sc.nextDouble();
            }
            System.out.printf("MEDIA = %.2f", soma / cont);
        }


        sc.close();
    }
}