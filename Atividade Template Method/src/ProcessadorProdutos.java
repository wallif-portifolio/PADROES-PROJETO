public class ProcessadorProdutos extends ProcessadorArquivo {
    @Override
    protected void validarFormato() {
        System.out.println("Validando campos de Produtos (Código, Preço).");
    }

    @Override
    protected void processarDados() {
        System.out.println("Atualizando estoque no catálogo.");
    }
}