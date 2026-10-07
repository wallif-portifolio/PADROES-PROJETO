package programa.fabricas.nacional;

import programa.fabricas.Fabrica;
import programa.interfaces.Pagamento;
import programa.interfaces.Frete;
import programa.interfaces.NotaFiscal;

public class FabricaNacional implements Fabrica {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoNac();
    }

    @Override
    public Frete criarFrete() {
        return new FreteNac();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalNac();
    }
}