package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaParesConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, i, soma = 0;

        System.out.println("Digite um numero inteiro:");
        x = sc.nextInt();

        while (x != 0) {
            for (i = 0; i < 5; i++) {
                if ((x % 2) == 0) {
                    soma += x;
                } else {
                    soma += x + 1;
                }
                x += 2;

            }
            System.out.printf("SOMA = %d\n", soma);
            soma = 0;
            System.out.println("Digite um numero inteiro");
            x = sc.nextInt();
        }

        sc.close();
    }
}
