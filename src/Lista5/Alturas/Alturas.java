package Lista5.Alturas;

public class Alturas {
    private String nome;
    private int idade;
    private double altura;

    public Alturas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}