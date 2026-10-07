public class Main {
    public static void main(String[] args) {
        ProcessadorArquivo p1 = new ProcessadorClientes();
        p1.processar();

        ProcessadorArquivo p2 = new ProcessadorProdutos();
        p2.processar();

        ProcessadorArquivo p3 = new ProcessadorVendas();
        p3.processar();
    }
}