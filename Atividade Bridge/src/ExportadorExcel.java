import java.util.List;

public class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> items, double total) {
        System.out.println("EXPORTANDO EXCEL");
        System.out.println("[" + titulo + "]");
        for (ItemRelatorio item : items) {
            System.out.println(item.getDescricao() + ";" + item.getValor());
        }
        System.out.println("TOTAL: " + total);
    }
}