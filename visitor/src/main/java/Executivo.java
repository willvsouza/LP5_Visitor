public class Executivo implements Funcionario {

    private int inscricao;
    private String nome;
    private String departamento;

    public Executivo(int inscricao, String nome, String departamento) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getInscricaoExecutivo() {
        return inscricao;
    }

    public String getNomeExecutivo() {
        return nome;
    }

    public String getDepartmento() {
        return departamento;
    }

    public String aceitar (Visitor visitor){
        return visitor.exibirExecutivo(this);
    }
}
