public class Medico {

    private MediadorClinica mediador;

    public Medico(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void solicitarExame() {
        mediador.enviarMensagem("Solicitando exame", "Médico");
    }
}