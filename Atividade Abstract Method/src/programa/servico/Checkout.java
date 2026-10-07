package programa.servico;

import programa.fabricas.Fabrica;
import programa.interfaces.Pagamento;
import programa.interfaces.Frete;
import programa.interfaces.NotaFiscal;

public class Checkout {
    private final Pagamento pagamento;
    private final Frete frete;
    private final NotaFiscal notaFiscal;

    public Checkout(Fabrica fabrica) {
        this.pagamento = fabrica.criarPagamento();
        this.frete = fabrica.criarFrete();
        this.notaFiscal = fabrica.criarNotaFiscal();
    }

    public void finalizar(String pedidoId, double valorProdutos,
                          double pesoKg, String cepDestino) {
        // 1) Calcular frete
        double valorFrete = frete.calcular(pesoKg, cepDestino);

        // 2) Calcular total
        double total = valorProdutos + valorFrete;

        // 3) Processar pagamento
        System.out.println("== CHECKOUT pedido " + pedidoId + " ==");
        System.out.println("Frete calculado: " + valorFrete);
        System.out.println("Total: " + total);

        pagamento.pagar(total);

        // 4) Emitir nota fiscal
        String nf = notaFiscal.emitir(pedidoId, total);
        System.out.println("NF gerada: " + nf);

        // 5) Finalizar
        System.out.println("Compra finalizada!\n");
    }
}