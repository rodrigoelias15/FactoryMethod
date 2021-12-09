import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfereProdutosVencidosTest {
    @Test
    void deveConferirProdutosVencidos() {
        IServico servico = ServicoFactory.obterServico("ConfereProdutosVencidos");
        assertEquals("Produto Vencido Encontrado", servico.executar());
    }

    @Test
    void deveCancelarConferirProdutosVencidos() {
        IServico servico = ServicoFactory.obterServico("ConfereProdutosVencidos");
        assertEquals("Nenhum produto buscado", servico.cancelar());
    }
}