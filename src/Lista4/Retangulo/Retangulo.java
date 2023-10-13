package Lista4.Retangulo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * largura + 2 * altura;
    }

    public double diagonal() {
       return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}


