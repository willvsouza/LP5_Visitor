public class Jogador implements Funcionario {

    private int inscricao;
    private String nome;
    private String posicao;

    private Time time;


    public Jogador(int inscricao, String nome, String posicao, Time time) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }

    public int getInscricaoJogador() {
        return inscricao;
    }

    public String getNomeJogador() {
        return nome;
    }

    public String getPosicaoJogador() {
        return posicao;
    }

    public String getNomeTime() {
        return this.time.getNomeTime();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJogador(this);
    }
}
