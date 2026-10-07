public class Paciente {

    private MediadorClinica mediador;

    public Paciente(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void chegar() {
        mediador.enviarMensagem("Paciente chegou na clínica", "Paciente");
    }
}