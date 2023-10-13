package Lista4.Alunos;

public class Alunos {
    private String nome;
    private double nota1, nota2, nota3;

    public Alunos(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) throws Exception {
        if (nota1 < 0 || nota1 > 30) {
            throw new Exception("A nota do primeiro trimestre deve estar entre 0 e 30.");
        }
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) throws Exception {
        if (nota2 < 0 || nota2 > 35) {
            throw new Exception("A nota do segundo trimestre deve estar entre 0 e 35.");
        }
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) throws Exception {
        if (nota3 < 0 || nota3 > 35) {
            throw new Exception("A nota do terceiro trimestre deve estar entre 0 e 35.");
        }
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }
}
