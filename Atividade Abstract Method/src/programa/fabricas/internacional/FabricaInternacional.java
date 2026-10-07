package programa.fabricas.internacional;

import programa.fabricas.Fabrica;
import programa.interfaces.Pagamento;
import programa.interfaces.Frete;
import programa.interfaces.NotaFiscal;

public class FabricaInternacional implements Fabrica {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoInt();
    }

    @Override
    public Frete criarFrete() {
        return new FreteInt();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalInt();
    }
}