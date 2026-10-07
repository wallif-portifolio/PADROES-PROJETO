public class ValidacaoMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao req) {
        if (!req.isDadosValidos()) {
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false; // Para aqui, não continua
        }

        System.out.println("VALIDAÇÃO: Dados válidos");
        return proximo.processar(req);
    }
}