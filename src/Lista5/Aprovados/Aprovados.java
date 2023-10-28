package Lista5.Aprovados;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int n = sc.nextInt();

        var alunos = new Alunos[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            sc.nextLine();
            String nome = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            alunos[i] = new Alunos(nome, n1, n2);
        }

        double media = 0;
        System.out.println("Alunos aprovados:");
        for (Alunos x : alunos) {
            if (((x.getN1() + x.getN2()) / 2) >= 6) {
                System.out.println(x.getNome());
            }
        }

        sc.close();
    }
}
