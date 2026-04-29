import java.util.List;

public class Main {
    public static void main(String[] args) {
        ItemRelatorio itemA = new ItemRelatorio("Produto A", 50);
        ItemRelatorio itemB = new ItemRelatorio("Produto B", 200);
        ItemRelatorio itemC = new ItemRelatorio("Produto C", 150);
        List<ItemRelatorio> itens = List.of(itemA, itemB, itemC);

        RelatorioFinanceiro rel1 = new RelatorioFinanceiro(new ExportadorPDF());
        itens.forEach(rel1::adicionarItem);
        System.out.println("CENÁRIO 1");
        rel1.gerar(false);

        System.out.println("\nCENÁRIO");
        RelatorioFinanceiro rel2 = new RelatorioFinanceiro(new ExportadorExcel());
        itens.forEach(rel2::adicionarItem);
        rel2.gerar(true);

        System.out.println("\nCENÁRIO 3");
        RelatorioVendas rel3 = new RelatorioVendas(new ExportadorPDF());
        itens.forEach(rel3::adicionarItem);
        rel3.gerar(true);

        System.out.println("\nCENÁRIO 4");
        RelatorioVendas rel4 = new RelatorioVendas(new ExportadorExcel());
        itens.forEach(rel4::adicionarItem);
        rel4.gerar(false);
    }
}