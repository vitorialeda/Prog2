package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.println("Deseja a tabuada para qual valor?");
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

        sc.close();
    }
}
