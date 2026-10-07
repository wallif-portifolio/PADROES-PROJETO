import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Setor> setores = new ArrayList<>();

        setores.add(new Armazem(100));
        setores.add(new Administrativo(20));
        setores.add(new Frota(15));
        setores.add(new Producao(30));

        VisitanteSetor seguranca = new InspecaoSeguranca();
        VisitanteSetor limpeza = new AvaliacaoLimpeza();

        System.out.println("SEGURANÇA");

        for (Setor s : setores) {
            s.aceitar(seguranca);
        }

        System.out.println();

        System.out.println("LIMPEZA");

        for (Setor s : setores) {
            s.aceitar(limpeza);
        }
    }
}