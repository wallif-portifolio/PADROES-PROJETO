package programa.fabricas.nacional;

import programa.interfaces.Pagamento;

public class PagamentoNac implements Pagamento {
    @Override
    public boolean pagar(double valor) {
        System.out.println("[NACIONAL] Pagamento aprovado");
        return true;
    }
}