package EstruturasRepetitivas;

import java.util.Scanner;

public class ProblemaComustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, x;

        System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
        x = sc.nextInt();
        while (x != 4) {
            switch (x) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:

            }
            System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar");
            x = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);

        sc.close();
    }
}
