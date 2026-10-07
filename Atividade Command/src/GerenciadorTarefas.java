import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<String> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(descricao);
        System.out.println("Tarefa adicionada: " + descricao);
    }

    public String removerUltimaTarefa() {
        if (!tarefas.isEmpty()) {
            String removida = tarefas.remove(tarefas.size() - 1);
            System.out.println("Tarefa removida: " + removida);
            return removida;
        }
        return null;
    }

    public void concluirTarefa(String descricao) {
        System.out.println("Tarefa concluída: " + descricao);
    }

    public void desfazerConclusao(String descricao) {
        System.out.println("Tarefa voltou para pendente: " + descricao);
    }

}