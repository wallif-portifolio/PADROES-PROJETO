public class RemoverUltimaTarefaCommand implements Command {
    private GerenciadorTarefas receiver;
    private String tarefaRemovida;

    public RemoverUltimaTarefaCommand(GerenciadorTarefas receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        tarefaRemovida = receiver.removerUltimaTarefa();
    }

    public void undo() {
        if (tarefaRemovida != null) {
            receiver.adicionarTarefa(tarefaRemovida);
        }
    }
}