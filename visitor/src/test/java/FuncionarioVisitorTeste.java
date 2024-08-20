import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioVisitorTeste {

    @Test
    void deveExibirJogador() {
        Jogador jogador = new Jogador(5, "Léo Jardim", "Goleiro", new Time("Vasco da Gama"));

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Jogador Léo Jardim, número 5 jogando na posição de Goleiro.", visitor.exibir(jogador));
    }

    @Test
    void deveExibirTreinador() {
        Treinador treinador = new Treinador(101010, "Felipe Jorge Loureiro");

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Treinador Felipe Jorge Loureiro com o seguinte reqistro no CREF: 101010.", visitor.exibir(treinador));
    }

    @Test
    void deveExibirExecutivo() {
        Executivo executivo = new Executivo(8,"Marcelo Sant´Ana", "Negócios");

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Executivo Marcelo Sant´Ana trabalhando no departamento de Negócios do time.", visitor.exibir(executivo));
    }

}
