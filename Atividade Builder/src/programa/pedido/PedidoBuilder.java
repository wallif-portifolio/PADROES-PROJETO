package programa.pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    private String tipo;
    private String tamanho;
    private String pagamento;
    private List<String> itens = new ArrayList<>();
    private String tipoPao;
    private String tipoMassa;
    private Boolean bordaRecheada = false;  // mudado para wrapper
    private String entrega = "RETIRADA";
    private String enderecoEntrega;
    private String cupom;
    private String observacao;
    private Double trocoPara;

    public PedidoBuilder tipoHamburguer() {
        this.tipo = "HAMBURGUER";
        return this;
    }

    public PedidoBuilder tipoPizza() {
        this.tipo = "PIZZA";
        return this;
    }

    public PedidoBuilder tamanhoP() {
        this.tamanho = "P";
        return this;
    }

    public PedidoBuilder tamanhoM() {
        this.tamanho = "M";
        return this;
    }

    public PedidoBuilder tamanhoG() {
        this.tamanho = "G";
        return this;
    }

    public PedidoBuilder pagarComPix() {
        this.pagamento = "PIX";
        return this;
    }

    public PedidoBuilder pagarComCartao() {
        this.pagamento = "CARTAO";
        return this;
    }

    public PedidoBuilder pagarComDinheiro() {
        this.pagamento = "DINHEIRO";
        return this;
    }

    public PedidoBuilder comTrocoPara(double valor) {
        this.trocoPara = valor;
        return this;
    }

    public PedidoBuilder entregaDelivery(String endereco) {
        this.entrega = "DELIVERY";
        this.enderecoEntrega = endereco;
        return this;
    }

    public PedidoBuilder entregaRetirada() {
        this.entrega = "RETIRADA";
        this.enderecoEntrega = null;
        return this;
    }

    public PedidoBuilder tipoPao(String pao) {
        this.tipoPao = pao;
        return this;
    }

    public PedidoBuilder tipoMassa(String massa) {
        this.tipoMassa = massa;
        return this;
    }

    public PedidoBuilder comBordaRecheada() {
        this.bordaRecheada = true;
        return this;
    }

    public PedidoBuilder semBordaRecheada() {
        this.bordaRecheada = false;
        return this;
    }

    public PedidoBuilder addItem(String item) {
        this.itens.add(item);
        return this;
    }

    public PedidoBuilder comCupom(String cupom) {
        this.cupom = cupom;
        return this;
    }

    public PedidoBuilder comObservacao(String obs) {
        this.observacao = obs;
        return this;
    }

    public Pedido build() {
        if (tipo == null || (!tipo.equals("HAMBURGUER") && !tipo.equals("PIZZA"))) {
            throw new IllegalStateException("Tipo deve ser HAMBURGUER ou PIZZA");
        }

        if (tamanho == null || (!tamanho.equals("P") && !tamanho.equals("M") && !tamanho.equals("G"))) {
            throw new IllegalStateException("Tamanho deve ser P, M ou G");
        }

        if (pagamento == null || (!pagamento.equals("PIX") && !pagamento.equals("CARTAO") && !pagamento.equals("DINHEIRO"))) {
            throw new IllegalStateException("Pagamento deve ser PIX, CARTAO ou DINHEIRO");
        }

        if (itens.isEmpty()) {
            throw new IllegalStateException("Adicione pelo menos 1 item");
        }

        if (tipo.equals("HAMBURGUER")) {
            if (tipoPao == null) {
                throw new IllegalStateException("Hambúrguer precisa de pão");
            }
            if (!tipoPao.equals("BRIOCHE") && !tipoPao.equals("TRADICIONAL") && !tipoPao.equals("INTEGRAL")) {
                throw new IllegalStateException("Pão deve ser BRIOCHE, TRADICIONAL ou INTEGRAL");
            }
            if (bordaRecheada != null && bordaRecheada) {
                throw new IllegalStateException("Hambúrguer não pode ter borda recheada");
            }
            tipoMassa = null;
        }

        if (tipo.equals("PIZZA")) {
            if (tipoMassa == null) {
                throw new IllegalStateException("Pizza precisa de massa");
            }
            if (!tipoMassa.equals("FINA") && !tipoMassa.equals("TRADICIONAL") && !tipoMassa.equals("PAN")) {
                throw new IllegalStateException("Massa deve ser FINA, TRADICIONAL ou PAN");
            }
            // Garantir que campos de hambúrguer fiquem null
            tipoPao = null;
        }

        if (entrega.equals("DELIVERY") && (enderecoEntrega == null || enderecoEntrega.trim().isEmpty())) {
            throw new IllegalStateException("Delivery precisa de endereço");
        }

        if (entrega.equals("RETIRADA") && enderecoEntrega != null) {
            throw new IllegalStateException("Retirada não deve ter endereço");
        }

        if (!pagamento.equals("DINHEIRO") && trocoPara != null) {
            throw new IllegalStateException("Troco só pode ser informado para pagamento em DINHEIRO");
        }

        if (pagamento.equals("DINHEIRO") && trocoPara != null && trocoPara <= 0) {
            throw new IllegalStateException("Troco deve ser maior que zero");
        }

        return new Pedido(this);
    }

    public String getTipo() { return tipo; }
    public String getTamanho() { return tamanho; }
    public String getPagamento() { return pagamento; }
    public List<String> getItens() { return itens; }
    public String getTipoPao() { return tipoPao; }
    public String getTipoMassa() { return tipoMassa; }
    public Boolean isBordaRecheada() { return bordaRecheada; }
    public String getEntrega() { return entrega; }
    public String getEnderecoEntrega() { return enderecoEntrega; }
    public String getCupom() { return cupom; }
    public String getObservacao() { return observacao; }
    public Double getTrocoPara() { return trocoPara; }
}