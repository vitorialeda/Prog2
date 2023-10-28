package Lista5.Comerciante;

import java.util.Scanner;
import java.util.Locale;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Serao digitados quantos produtos?");
        int n = sc.nextInt();

        var vet = new Mercadoria[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.println("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Preco de compra:");
            double precoCompra = sc.nextDouble();
            System.out.println("Preco de venda:");
            double precoVenda = sc.nextDouble();

            vet[i] = new Mercadoria(nome, precoCompra, precoVenda);
        }

        int lucroAbaixo = 0;
        int lucroEntre = 0;
        int lucroAcima = 0;
        double somaVenda = 0;
        double somaCompra = 0;

        for (Mercadoria x : vet) {

            double lucro = (x.getPrecoVenda() - x.getPrecoCompra()) * 100 / x.getPrecoCompra();

            if (lucro < 10) {
                lucroAbaixo += 1;
            } else if (lucro >= 10 && lucro <= 20) {
                lucroEntre += 1;
            } else lucroAcima += 1;

            somaVenda += x.getPrecoVenda();
            somaCompra += x.getPrecoCompra();
        }

        System.out.println("RELATORIO:");
        System.out.println("Lucro abaixo de 10%: " + lucroAbaixo);
        System.out.println("Lucro entre 10% e 20%: " + lucroEntre);
        System.out.println("Lucro acima de 20%: " + lucroAcima);
        System.out.printf("Valor total de compra: %.2f\n", somaCompra);
        System.out.printf("Valor total de venda: %.2f\n", somaVenda);
        System.out.printf("Lucro total: %.2f\n", somaVenda - somaCompra);

        sc.close();
    }

}
