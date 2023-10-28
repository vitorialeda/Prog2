package Lista5;

import java.util.Scanner;
import java.util.Locale;

public class Abaixo_da_Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos este vetor terá? ");
        int n = sc.nextInt();

        var vetor = new double[n];

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        System.out.printf("MEDIA DO VETOR = %.3f\n", soma / vetor.length);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (double x : vetor) {
            if (x < soma / vetor.length) {
                System.out.println(x);
            }
        }

        sc.close();
    }
}
