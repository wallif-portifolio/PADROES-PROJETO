public class Main {
    public static void main(String[] args) {
        Middleware auth = new AuthMiddleware();
        Middleware permissao = new PermissaoMiddleware();
        Middleware validacao = new ValidacaoMiddleware();
        Middleware log = new LogMiddleware();
        Middleware controller = new ControllerMiddleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        System.out.println("Cenário 1 (válido)");
        Requisicao req1 = new Requisicao("admin", "valido", "ADMIN", true);
        auth.processar(req1);
        System.out.println();

        System.out.println("Cenário 2 (token inválido)");
        Requisicao req2 = new Requisicao("user", "invalido", "ADMIN", true);
        auth.processar(req2);
        System.out.println();

        System.out.println("Cenário 3 (sem permissão)");
        Requisicao req3 = new Requisicao("user", "valido", "USER", true);
        auth.processar(req3);
        System.out.println();

        System.out.println("Cenário 4 (dados inválidos)");
        Requisicao req4 = new Requisicao("admin", "valido", "ADMIN", false);
        auth.processar(req4);
    }
}