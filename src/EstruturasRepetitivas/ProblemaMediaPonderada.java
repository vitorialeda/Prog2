package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i;
        double num1, num2, num3;

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println("Digite tres numeros:");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();

            System.out.printf("MEDIA = %.1f\n", (num1 * 2 + num2 * 3 + num3 * 5) / 10);
        }

        sc.close();
    }
}
