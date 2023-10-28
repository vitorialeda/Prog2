package Lista5.Alturas;

import Lista5.Alturas.Alturas;

import java.util.Scanner;
import java.util.Locale;

public class AlturasApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Alturas[] vet = new Alturas[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: "); sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vet[i] = new Alturas(nome, idade, altura);
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vet[i].getAltura();
        }

        System.out.printf("Altura media: %.2f\n", soma / vet.length);

        double cont = 0;
        for (Alturas x : vet) {
            if (x.getIdade() < 16) cont += 1;
        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", cont / vet.length * 100);
        for (Alturas x : vet) {
            if (x.getIdade() < 16) System.out.println(x.getNome());
        }




        sc.close();
    }
}
