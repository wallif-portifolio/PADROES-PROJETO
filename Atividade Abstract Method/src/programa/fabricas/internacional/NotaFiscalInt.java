package programa.fabricas.internacional;

import programa.interfaces.NotaFiscal;

public class NotaFiscalInt implements NotaFiscal {
    @Override
    public String emitir(String pedidoId, double valor) {
        return "NF-INT-" + pedidoId;
    }
}