public class ProcessadorVendas extends ProcessadorArquivo {
    @Override
    protected void validarFormato() {
        System.out.println("Validando campos de Vendas (Data, Total).");
    }

    @Override
    protected void processarDados() {
        System.out.println("Gerando relatório de comissões.");
    }
}