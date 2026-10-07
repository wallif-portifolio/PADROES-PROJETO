package programa.fabricas.nacional;

import programa.interfaces.NotaFiscal;

public class NotaFiscalNac implements NotaFiscal {
    @Override
    public String emitir(String pedidoId, double valor) {
        return "NF-NAC-" + pedidoId;
    }
}