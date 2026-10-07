public class FaturamentoService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        String status = pedido.getStatus();

        if (status.equals("PAGO")) {
            System.out.println("FATURAMENTO: Gerando lançamento financeiro do pedido " + pedido.getId());
        } else if (status.equals("CANCELADO")) {
            System.out.println("FATURAMENTO: Estornando valores do pedido " + pedido.getId());
        }
    }
}