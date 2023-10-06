package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExperiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, quant;
        double rato = 0, coelho = 0, sapo = 0, total = 0;
        char cobaia;

        System.out.print("Quantos casos de teste serao digitados? ");
        i = sc.nextInt();

        for (; i > 0; i--) {
            System.out.print("Quantidade de cobaias: ");
            quant = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            cobaia = sc.next().charAt(0);

            if (cobaia == 'R') {
                rato += quant;
            } else if (cobaia == 'S') {
                sapo += quant;
            } else if (cobaia == 'C') {
                coelho += quant;
            }

            total += quant;
        }
        System.out.println("RELATORIO FINAL:");
        System.out.printf("Total: %.0f cobaias\n" +
                "Total de coelhos: %.0f\n" +
                "Total de ratos: %.0f\n" +
                "Total de sapos: %.0f\n" +
                "Percentual de coelhos: %.2f\n" +
                "Percentual de ratos: %.2f\n" +
                "Percentual de sapos: %.2f\n", total, coelho, rato, sapo, coelho / total * 100, rato / total * 100, sapo / total * 100);

        sc.close();
    }
}
