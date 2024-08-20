public class FuncionarioVisitor implements Visitor {

    public String exibir(Funcionario funcionario) {
        return funcionario.aceitar(this);
    }

    @Override
    public String exibirJogador(Jogador jogador) {
        return "Jogador " + jogador.getNomeJogador() +
                ", número " + jogador.getInscricaoJogador() +
                " jogando na posição de " + jogador.getPosicaoJogador() + ".";
    }

    @Override
    public String exibirTreinador(Treinador treinador) {
        return "Treinador " + treinador.getNomeTreinador() +
                " com o seguinte reqistro no CREF: " +
                treinador.getInscricaoTreinador() + ".";
    }

    @Override
    public String exibirExecutivo(Executivo executivo) {
        return "Executivo " + executivo.getNomeExecutivo() +
                " trabalhando no departamento de " + executivo.getDepartmento() +
                " do time.";
    }
}
