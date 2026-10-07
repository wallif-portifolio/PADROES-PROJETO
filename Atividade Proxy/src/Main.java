public class Main {
    public static void main(String[] args) {
        Conteudo conteudo = new FilmePremiumProxy();

        System.out.println("=== PLATAFORMA DE STREAMING ===\n");

        System.out.println("--- Cenário 1: Usuário PREMIUM ---");
        Usuario carlos = new Usuario("Carlos", Usuario.PLANO_PREMIUM);
        conteudo.assistir(carlos);

        System.out.println();

        System.out.println("--- Cenário 2: Usuário BÁSICO ---");
        Usuario ana = new Usuario("Ana", Usuario.PLANO_BASICO);
        conteudo.assistir(ana);

        System.out.println();

        System.out.println("--- Cenário 3: Usuário PREMIUM ---");
        Usuario marina = new Usuario("Marina", Usuario.PLANO_PREMIUM);
        conteudo.assistir(marina);

        System.out.println();

        System.out.println("--- Cenário 4: Usuário BÁSICO ---");
        Usuario pedro = new Usuario("Pedro", Usuario.PLANO_BASICO);
        conteudo.assistir(pedro);

        System.out.println();

        System.out.println("--- Cenário 5: Usuário INVÁLIDO ---");
        try {
            conteudo.assistir(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}