public class AvaliacaoLimpeza implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {
        System.out.println("Avaliando limpeza do armazém");
    }

    @Override
    public void visitar(Administrativo administrativo) {
        System.out.println("Avaliando limpeza do administrativo");
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println("Avaliando limpeza da frota");
    }

    @Override
    public void visitar(Producao producao) {
        System.out.println("Avaliando limpeza da produção");
    }
}