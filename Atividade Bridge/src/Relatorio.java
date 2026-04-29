import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Relatorio {
    protected Exportador exportador;
    protected List<ItemRelatorio> items;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.items = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item) {
        items.add(item);
    }

    protected double calcularTotal(List<ItemRelatorio> itensFiltrados) {
        return itensFiltrados.stream().mapToDouble(ItemRelatorio::getValor).sum();
    }

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado) {
        if (detalhado) {
            return new ArrayList<>(items);
        } else {
            return items.stream()
                    .filter(item -> item.getValor() >= 100)
                    .collect(Collectors.toList());
        }
    }

    public abstract void gerar(boolean detalhado);
}