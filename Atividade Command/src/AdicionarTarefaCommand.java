public class AdicionarTarefaCommand implements Command {
    private GerenciadorTarefas receiver;
    private String descricao;

    public AdicionarTarefaCommand(GerenciadorTarefas receiver, String descricao) {
        this.receiver = receiver;
        this.descricao = descricao;
    }

    public void execute() {
        receiver.adicionarTarefa(descricao);
    }

    public void undo() {
        receiver.removerUltimaTarefa();
    }
}