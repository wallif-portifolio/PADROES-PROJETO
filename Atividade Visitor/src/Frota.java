public class Frota implements Setor {

    private int veiculos;

    public Frota(int veiculos) {
        this.veiculos = veiculos;
    }

    public int getVeiculos() {
        return veiculos;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}