package Lista4.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a largura e altura do retangulo:");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Retangulo x = new Retangulo(largura, altura);

        System.out.printf("AREA = %.2f\n", x.area());
        System.out.printf("PERIMETRO = %.2f\n", x.perimetro());
        System.out.printf("DIAGONAL = %.2f\n", x.diagonal());

        sc.close();
    }
}
