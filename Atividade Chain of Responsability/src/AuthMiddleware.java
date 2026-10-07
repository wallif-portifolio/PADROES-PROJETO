public class AuthMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao req) {
        if (!req.getToken().equals("valido")) {
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
        }

        System.out.println("AUTH: Token válido");
        return proximo.processar(req);
    }
}