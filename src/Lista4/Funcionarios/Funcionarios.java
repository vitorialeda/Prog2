package Lista4.Funcionarios;

public class Funcionarios {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionarios(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        this.salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String getNome() {
        return nome;
    }
}
