public class Producao implements Setor {

    private int maquinas;

    public Producao(int maquinas) {
        this.maquinas = maquinas;
    }

    public int getMaquinas() {
        return maquinas;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}