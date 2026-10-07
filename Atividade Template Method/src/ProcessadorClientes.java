public class ProcessadorClientes extends ProcessadorArquivo {
    @Override
    protected void validarFormato() {
        System.out.println("Validando campos de Clientes (Nome, CPF).");
    }

    @Override
    protected void processarDados() {
        System.out.println("Cruzando dados de clientes no banco.");
    }
}