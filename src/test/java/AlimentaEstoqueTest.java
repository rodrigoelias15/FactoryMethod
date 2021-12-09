import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlimentaEstoqueTest {
    @Test
    void deveAlimentarEstoque() {
        IServico servico = ServicoFactory.obterServico("AlimentaEstoque");
        assertEquals("Item adicionado ao estoque", servico.executar());
    }

    @Test
    void deveCancelarAlimentarEstoque() {
        IServico servico = ServicoFactory.obterServico("AlimentaEstoque");
        assertEquals("Nenhum item adicionado", servico.cancelar());
    }
}