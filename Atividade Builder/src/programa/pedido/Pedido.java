package programa.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final String tipo;
    private final String tamanho;
    private final String pagamento;
    private final List<String> itens;
    private final String tipoPao;
    private final String tipoMassa;
    private final Boolean bordaRecheada;  // mudado para wrapper
    private final String entrega;
    private final String enderecoEntrega;
    private final String cupom;
    private final String observacao;
    private final Double trocoPara;

    public Pedido(PedidoBuilder builder) {
        this.tipo = builder.getTipo();
        this.tamanho = builder.getTamanho();
        this.pagamento = builder.getPagamento();
        this.itens = new ArrayList<>(builder.getItens());
        this.tipoPao = builder.getTipoPao();
        this.tipoMassa = builder.getTipoMassa();
        this.bordaRecheada = builder.isBordaRecheada();
        this.entrega = builder.getEntrega();
        this.enderecoEntrega = builder.getEnderecoEntrega();
        this.cupom = builder.getCupom();
        this.observacao = builder.getObservacao();
        this.trocoPara = builder.getTrocoPara();
    }

    public List<String> getItens() {
        return new ArrayList<>(itens);
    }

    public void printResumo() {
        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Itens: " + itens);

        if (tipo.equals("HAMBURGUER")) {
            System.out.println("Pão: " + tipoPao);
        } else if (tipo.equals("PIZZA")) {
            System.out.println("Massa: " + tipoMassa);
            System.out.println("Borda Recheada: " + (bordaRecheada != null && bordaRecheada ? "Sim" : "Não"));
        }

        System.out.println("Pagamento: " + pagamento);
        if (trocoPara != null) {
            System.out.println("Troco para: R$ " + trocoPara);
        }

        System.out.println("Entrega: " + entrega);
        if (enderecoEntrega != null && !enderecoEntrega.isEmpty()) {
            System.out.println("Endereço: " + enderecoEntrega);
        }

        if (cupom != null && !cupom.isEmpty()) {
            System.out.println("Cupom: " + cupom);
        }

        if (observacao != null && !observacao.isEmpty()) {
            System.out.println("Obs: " + observacao);
        }
        System.out.println("========================");
    }
}