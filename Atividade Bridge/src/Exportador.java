import java.util.List;

public interface Exportador {
    void exportar(String titulo, List<ItemRelatorio> items, double total);
}