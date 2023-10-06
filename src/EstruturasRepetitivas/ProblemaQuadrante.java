package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaQuadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1, y = 1;

        while (x != 0 && y != 0) {

            System.out.println("Digite os valores das coordenadas X e Y:");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE Q1");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante Q4");
            } else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE Q2");
            } else if (x < 0) {
                System.out.println("QUADRANTE Q3");
            }
        }

        sc.close();
    }
}
