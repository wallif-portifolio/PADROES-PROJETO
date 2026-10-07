public class Main {

    public static void main(String[] args) {

        MediadorClinica central = new CentralAtendimentoClinica();

        Paciente paciente = new Paciente(central);
        Recepcao recepcao = new Recepcao(central);
        Medico medico = new Medico(central);
        Enfermagem enfermagem = new Enfermagem(central);
        Laboratorio laboratorio = new Laboratorio(central);

        paciente.chegar();

        recepcao.iniciarAtendimento();

        enfermagem.prepararPaciente();

        medico.solicitarExame();

        laboratorio.enviarResultado();

        recepcao.finalizarAtendimento();
    }
}