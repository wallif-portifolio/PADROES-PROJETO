public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas tarefas = new GerenciadorTarefas();
        PainelControle painel = new PainelControle();

        painel.executar(new AdicionarTarefaCommand(tarefas, "Estudar Command"));
        painel.executar(new AdicionarTarefaCommand(tarefas, "Implementar exercício"));
        painel.executar(new ConcluirTarefaCommand(tarefas, "Estudar Command"));

        painel.desfazer();

        painel.adicionarNaFila(new AdicionarTarefaCommand(tarefas, "Revisar Observer"));
        painel.adicionarNaFila(new AdicionarTarefaCommand(tarefas, "Estudar Chain of Responsibility"));
        painel.adicionarNaFila(new ConcluirTarefaCommand(tarefas, "Implementar exercício"));

        painel.processarFila();

    }
}