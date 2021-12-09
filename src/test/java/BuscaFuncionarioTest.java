import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaFuncionarioTest {
    @Test
    void deveBuscarFuncionario() {
        IServico servico = ServicoFactory.obterServico("BuscaFuncionario");
        assertEquals("Funcionario Encontrado", servico.executar());
    }

    @Test
    void deveCancelarBuscarFuncionario() {
        IServico servico = ServicoFactory.obterServico("BuscaFuncionario");
        assertEquals("Busca Não Realizada", servico.cancelar());
    }
}