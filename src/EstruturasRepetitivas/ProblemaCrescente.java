package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 0, Y = 1;

        while (X != Y) {
            System.out.println("Digite dois numeros:");
            X = sc.nextInt();
            Y = sc.nextInt();
            if (X < Y) {
                System.out.println("CRESCENTE!");
            } else {
                System.out.println("DECRESCENTE!");
            }
        }

        sc.close();
    }
}
