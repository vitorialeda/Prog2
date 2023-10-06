package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.print("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if ((numero % 2) == 0 && numero > 0) {
                System.out.println("PAR POSITIVO");
            } else if ((numero % 2) == 0 && numero < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (numero > 0) {
                System.out.println("IMPAR POSITIVO");
            } else if (numero < 0) {
                System.out.println("IMPAR NEGATIVO");
            } else System.out.println("NULO");

        }

        sc.close();
    }
}
