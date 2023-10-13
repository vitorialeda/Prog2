package Lista4.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class AlunosApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();

        Alunos a = new Alunos(nome);

        System.out.println("Digite a nota do primeiro, segundo e terceiro trimestre:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        a.setNota1(n1);
        a.setNota2(n2);
        a.setNota3(n3);

        System.out.printf("NOTA FINAL = %.2f\n", a.notaFinal());

        if (a.notaFinal() < 60) {
            System.out.printf("REPROVADO\nFALTAM %.2f PONTOS\n", 60 - a.notaFinal());
        } else System.out.println("APROVADO\n");


        sc.close();
    }
}
