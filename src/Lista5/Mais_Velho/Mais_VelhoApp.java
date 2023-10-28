package Lista5.Mais_Velho;

import java.util.Scanner;

public class Mais_VelhoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        var vet = new Mais_Velho[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vet[i] = new Mais_Velho(nome, idade);
        }

        int maior = 0;
        int indice = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() > maior) {
                maior = vet[i].getIdade();
                indice = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + vet[indice].getNome());


        sc.close();
    }
}
