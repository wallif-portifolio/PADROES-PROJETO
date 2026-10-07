public class EstoqueService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        String status = pedido.getStatus();

        if (status.equals("PAGO")) {
            System.out.println("ESTOQUE: Reservando itens do pedido " + pedido.getId());
        } else if (status.equals("CANCELADO")) {
            System.out.println("ESTOQUE: Devolvendo itens ao estoque do pedido " + pedido.getId());
        }
    }
}