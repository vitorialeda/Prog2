package EstruturasRepetitivas;

import java.util.Scanner;

public class Problema_Senha_Fixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida! Tente novamente:");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
