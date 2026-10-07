public class ConcluirTarefaCommand implements Command {
    private GerenciadorTarefas lista;
    private String nome;

    public ConcluirTarefaCommand(GerenciadorTarefas lista, String nome) {
        this.lista = lista;
        this.nome = nome;
    }

    public void execute() {
        lista.concluirTarefa(nome);
    }

    public void undo() {
        lista.desfazerConclusao(nome);
    }
}