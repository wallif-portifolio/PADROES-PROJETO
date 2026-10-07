public class Recepcao {

    private MediadorClinica mediador;

    public Recepcao(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void iniciarAtendimento() {
        mediador.enviarMensagem("Atendimento iniciado", "Recepção");
    }

    public void finalizarAtendimento() {
        mediador.enviarMensagem("Atendimento finalizado", "Recepção");
    }
}