package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDivisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i;
        double num, den;

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Entre com o numerador: ");
            num = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            den = sc.nextDouble();

            if (den == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                System.out.printf("DIVISAO = %.2f\n", num / den);
            }
        }

        sc.close();
    }
}
