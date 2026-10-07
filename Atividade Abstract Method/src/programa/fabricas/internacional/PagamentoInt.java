package programa.fabricas.internacional;

import programa.interfaces.Pagamento;

public class PagamentoInt implements Pagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("[INTERNACIONAL] Pagamento aprovado com taxa");
        return true;
    }
}