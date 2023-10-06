package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaDentroFora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, numero, dentro = 0, fora = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }

        }
        System.out.printf("%d DENTRO\n%d FORA", dentro, fora);

        sc.close();
    }
}
