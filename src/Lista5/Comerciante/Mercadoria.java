package Lista5.Comerciante;

public class Mercadoria {
    private String nome;
    private double precoCompra;
    private double precoVenda;

    public Mercadoria(String nome, double precoCompra, double precoVenda) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

}
