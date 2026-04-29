import programa.pedido.Pedido;
import programa.pedido.PedidoBuilder;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("=== CASO 1 - Hambúrguer ===");
            Pedido p1 = new PedidoBuilder()
                    .tipoHamburguer()
                    .tamanhoM()
                    .pagarComPix()
                    .entregaDelivery("Rua A, 123")
                    .tipoPao("BRIOCHE")
                    .addItem("X-Bacon")
                    .comObservacao("sem cebola")
                    .build();
            p1.printResumo();
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        try {
            System.out.println("\n=== CASO 2 - Pizza ===");
            Pedido p2 = new PedidoBuilder()
                    .tipoPizza()
                    .tamanhoG()
                    .pagarComCartao()
                    .entregaRetirada()
                    .tipoMassa("FINA")
                    .comBordaRecheada()
                    .addItem("Calabresa")
                    .comCupom("10OFF")
                    .build();
            p2.printResumo();
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        try {
            System.out.println("\n=== CASO 3 - Dinheiro com troco ===");
            Pedido p3 = new PedidoBuilder()
                    .tipoHamburguer()
                    .tamanhoP()
                    .pagarComDinheiro()
                    .comTrocoPara(100.0)
                    .entregaRetirada()
                    .tipoPao("TRADICIONAL")
                    .addItem("X-Salada")
                    .build();
            p3.printResumo();
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== CASO 4 - Testes com erros ===");

        try {
            new PedidoBuilder()
                    .tipoPizza()
                    .tamanhoG()
                    .pagarComCartao()
                    .addItem("Pizza")
                    .build();
        } catch (Exception e) {
            System.out.println("Erro esperado (pizza sem massa): " + e.getMessage());
        }

        try {
            new PedidoBuilder()
                    .tipoHamburguer()
                    .tamanhoM()
                    .pagarComPix()
                    .addItem("X-Tudo")
                    .build();
        } catch (Exception e) {
            System.out.println("Erro esperado (hamburguer sem pão): " + e.getMessage());
        }

        try {
            new PedidoBuilder()
                    .tipoHamburguer()
                    .tamanhoM()
                    .pagarComPix()
                    .tipoPao("BRIOCHE")
                    .addItem("X-Bacon")
                    .entregaDelivery(null)
                    .build();
        } catch (Exception e) {
            System.out.println("Erro esperado (delivery sem endereço): " + e.getMessage());
        }

        try {
            new PedidoBuilder()
                    .tipoHamburguer()
                    .tamanhoM()
                    .pagarComPix()
                    .tipoPao("BRIOCHE")
                    .addItem("X-Tudo")
                    .comTrocoPara(50.0)
                    .build();
        } catch (Exception e) {
            System.out.println("Erro esperado (pix com troco): " + e.getMessage());
        }

        try {
            new PedidoBuilder()
                    .tipoHamburguer()
                    .tamanhoM()
                    .pagarComPix()
                    .tipoPao("BRIOCHE")
                    .comBordaRecheada()
                    .addItem("X-Bacon")
                    .build();
        } catch (Exception e) {
            System.out.println("Erro esperado (borda em hamburguer): " + e.getMessage());
        }
    }
}