public class LogMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao req) {
        System.out.println("LOG: Requisição processada");
        return proximo.processar(req);
    }
}