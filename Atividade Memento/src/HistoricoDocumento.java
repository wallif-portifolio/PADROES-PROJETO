public class HistoricoDocumento {

    private MementoDocumento versao1;
    private MementoDocumento versao2;

    public void salvarVersao1(MementoDocumento memento) {
        versao1 = memento;
    }

    public void salvarVersao2(MementoDocumento memento) {
        versao2 = memento;
    }

    public MementoDocumento getVersao1() {
        return versao1;
    }

    public MementoDocumento getVersao2() {
        return versao2;
    }
}