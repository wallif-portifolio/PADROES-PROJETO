import java.util.List;

public class RelatorioFinanceiro extends Relatorio {
    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> itensFiltrados = filtrarItensDetalhados(detalhado);
        double total = calcularTotal(itensFiltrados);
        exportador.exportar("Relatório Financeiro", itensFiltrados, total);
    }
}