package Lista5;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        var vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < n; i++) {
            if (vet[i] < 0) System.out.println(vet[i]);
        }

        sc.close();
    }

}