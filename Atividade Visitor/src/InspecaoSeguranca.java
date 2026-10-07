public class InspecaoSeguranca implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {
        System.out.println("Inspecionando segurança do armazém");
    }

    @Override
    public void visitar(Administrativo administrativo) {
        System.out.println("Inspecionando segurança do administrativo");
    }

    @Override
    public void visitar(Frota frota) {
        System.out.println("Inspecionando segurança da frota");
    }

    @Override
    public void visitar(Producao producao) {
        System.out.println("Inspecionando segurança da produção");
    }
}