import java.util.ArrayList;

public class PainelControle {
    private ArrayList<Command> historico = new ArrayList<>();
    private ArrayList<Command> fila = new ArrayList<>();

    public void executar(Command cmd) {
        cmd.execute();
        historico.add(cmd);
    }

    public void desfazer() {
        if (!historico.isEmpty()) {
            Command ultimo = historico.remove(historico.size() - 1);
            System.out.println("Desfazendo último comando...");
            ultimo.undo();
        }
    }

    public void adicionarNaFila(Command cmd) {
        fila.add(cmd);
        System.out.println("Comando adicionado na fila.");
    }

    public void processarFila() {
        System.out.println("Processando fila...");
        for (Command cmd : fila) {
            cmd.execute();
        }
        fila.clear();
    }
}