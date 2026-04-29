import java.util.List;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> items, double total) {
        System.out.println("EXPORTANDO PDF");
        System.out.println("Título: " + titulo);
        System.out.println("Itens:");
        for (ItemRelatorio item : items) {
            System.out.printf("  - %s | R$ %.2f%n", item.getDescricao(), item.getValor());
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}