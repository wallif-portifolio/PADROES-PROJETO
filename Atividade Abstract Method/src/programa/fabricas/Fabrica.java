package programa.fabricas;

import programa.interfaces.Pagamento;
import programa.interfaces.Frete;
import programa.interfaces.NotaFiscal;

public interface Fabrica {
    Pagamento criarPagamento();
    Frete criarFrete();
    NotaFiscal criarNotaFiscal();
}