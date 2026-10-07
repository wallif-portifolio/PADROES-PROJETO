public class Laboratorio {

    private MediadorClinica mediador;

    public Laboratorio(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void enviarResultado() {
        mediador.enviarMensagem("Resultado do exame pronto", "Laboratório");
    }
}