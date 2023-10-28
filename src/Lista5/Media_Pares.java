package Lista5;

import java.util.Scanner;

public class Media_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos esse vetor terá?");
        int n = sc.nextInt();

        var vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        double soma = 0;
        int cont = 0;
        for (int x : vet) {
            if ((x % 2) == 0) {
                soma += x;
                cont += 1;
            }
        }

        if ((soma / cont) != 0) {
            System.out.printf("MEDIA DOS PARES = %.1f", soma / cont);
        } else System.out.println("NENHUM NUMERO PAR");

        sc.close();
    }
}
