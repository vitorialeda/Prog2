package Lista5;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }


        System.out.println("\nNUMEROS PARES:");
        int cont = 0;
        for (int x : vet) {
            if ((x % 2) == 0) {
                System.out.print(x + "  ");
                cont += 1;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d", cont);

        sc.close();
    }
}
