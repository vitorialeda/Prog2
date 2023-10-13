package Lista4.Cambio;

import java.util.Locale;
import java.util.Scanner;

public class CambioApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dolar? ");
        double valDolar = sc.nextDouble();
        System.out.print("Quantos dolares serao comprados? ");
        double quantidade = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais = %.2f\n", Cambio.conversor(valDolar, quantidade));

        sc.close();
    }
}
