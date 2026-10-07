public class Administrativo implements Setor {

    private int funcionarios;

    public Administrativo(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}