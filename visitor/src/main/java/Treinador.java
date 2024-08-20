public class Treinador implements Funcionario {

    private int inscricao;
    private String nome;

    public Treinador(int inscricao, String nome) {
        this.inscricao = inscricao;
        this.nome = nome;
    }

    public int getInscricaoTreinador() {
        return inscricao;
    }

    public String getNomeTreinador() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTreinador(this);
    }
}
