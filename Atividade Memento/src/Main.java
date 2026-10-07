public class Main {

    public static void main(String[] args) {

        Documento doc = new Documento("Versão 1");
        HistoricoDocumento historico = new HistoricoDocumento();

        doc.exibir();

        historico.salvarVersao1(doc.salvar());

        doc.setConteudo("Versão 2");
        doc.exibir();

        historico.salvarVersao2(doc.salvar());

        doc.setConteudo("Versão 3");
        doc.exibir();

        doc.restaurar(historico.getVersao2());
        doc.exibir();

        doc.restaurar(historico.getVersao1());
        doc.exibir();
    }
}