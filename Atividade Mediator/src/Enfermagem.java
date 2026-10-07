public class Enfermagem {

    private MediadorClinica mediador;

    public Enfermagem(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void prepararPaciente() {
        mediador.enviarMensagem("Paciente preparado", "Enfermagem");
    }
}