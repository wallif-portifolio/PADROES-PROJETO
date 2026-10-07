public class CentralAtendimentoClinica implements MediadorClinica {

    @Override
    public void enviarMensagem(String mensagem, String setor) {
        System.out.println(setor + ": " + mensagem);
    }
}