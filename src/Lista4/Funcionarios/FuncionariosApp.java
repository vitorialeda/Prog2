package Lista4.Funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class FuncionariosApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        double salBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Funcionarios a = new Funcionarios(nome, salBruto, imposto);

        System.out.printf("Funcionario: %s, R$ %.2f\n", a.getNome(), a.salarioLiquido());

        System.out.print("Qual a porcentagem para aumentar o salario? ");
        double porcentagem = sc.nextDouble();
        a.aumentarSalario(porcentagem);

        System.out.printf("Dados atualizados: %s, R$ %.2f\n", a.getNome(), a.salarioLiquido());

        sc.close();
    }
}
