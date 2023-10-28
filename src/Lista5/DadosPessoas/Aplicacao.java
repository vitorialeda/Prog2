package Lista5.DadosPessoas;

import java.util.Scanner;
import java.util.Locale;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        var vet = new Pessoas[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "a pessoa:");
            double altura = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a pessoa:");
            char genero = sc.next().toUpperCase().charAt(0);

            vet[i] = new Pessoas(genero, altura);
        }

        double soma = 0;
        int cont = 0;
        double menorAltura = vet[0].getAltura();
        double maiorAltura = vet[0].getAltura();
        for (Pessoas x : vet) {
            if (x.getAltura() < menorAltura) {
                menorAltura = x.getAltura();
            }

            if (x.getAltura() > maiorAltura) {
                maiorAltura = x.getAltura();
            }

            if (x.getGenero() == 'F') {
                soma += x.getAltura();
                cont += 1;
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", (soma / cont));
        System.out.println("Numero de homens = " + (vet.length - cont));

        sc.close();
    }

}
