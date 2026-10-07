public class Armazem implements Setor {

    private int quantidadeCaixas;

    public Armazem(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
    }

    public int getQuantidadeCaixas() {
        return quantidadeCaixas;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}