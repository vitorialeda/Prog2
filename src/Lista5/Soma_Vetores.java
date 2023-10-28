package Lista5;

import java.util.Scanner;

public class Soma_Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores cada vetor terá? ");
        int n = sc.nextInt();

        double[] vetA = new double[n];
        double[] vetB = new double[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            vetA[i] = sc.nextDouble();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vetB[i] = sc.nextDouble();
        }


        System.out.println("VETOR RESULTANTE:");
        double[] vetC = new double[n];
        for (int i = 0; i < n; i++) {
            vetC[i] = vetA[i] + vetB[i];
            System.out.println(vetC[i]);
        }

        sc.close();
    }
}
