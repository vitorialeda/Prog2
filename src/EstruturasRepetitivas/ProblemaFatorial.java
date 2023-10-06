package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, fat = 1;

        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        for (; n > 0; n--) {
            fat *= n;
        }

        System.out.println("Fatorial = " + fat);

        sc.close();
    }
}
