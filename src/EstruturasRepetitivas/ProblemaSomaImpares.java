package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaSomaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, aux, soma = 0;

        System.out.println("Digite dois numeros:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }
        x++;
        for (; x < y; x++) {
            if ((x % 2) != 0) {
                soma += x;
                System.out.println(soma);
            }
        }

        System.out.println("SOMA DOS IMPARES = " + soma);

    }
}
