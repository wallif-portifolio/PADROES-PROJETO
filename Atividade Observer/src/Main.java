public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Miquéias", "miqueias@email.com");

        Pedido pedido = new Pedido("PED-001", "CRIADO", cliente);

        pedido.adicionarObserver(new EmailService());
        pedido.adicionarObserver(new LogService());
        pedido.adicionarObserver(new DashboardService());
        pedido.adicionarObserver(new EstoqueService());
        pedido.adicionarObserver(new FaturamentoService());

        System.out.println("Mudando status para PAGO");
        pedido.atualizarStatus("PAGO");

        System.out.println("\nMudando status para EM_SEPARACAO");
        pedido.atualizarStatus("EM_SEPARACAO");

        System.out.println("\nMudando status para ENVIADO");
        pedido.atualizarStatus("ENVIADO");

        System.out.println("\nMudando status para CANCELADO");
        pedido.atualizarStatus("CANCELADO");
    }
}