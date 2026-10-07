public class Main {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();

        fila.adicionarSenha(new SenhaAtendimento("A001", "Maria", "Prioritário"));
        fila.adicionarSenha(new SenhaAtendimento("A002", "João", "Normal"));
        fila.adicionarSenha(new SenhaAtendimento("A003", "Carlos", "Financeiro"));
        fila.adicionarSenha(new SenhaAtendimento("A004", "Ana", "Agendamento"));
        fila.adicionarSenha(new SenhaAtendimento("A005", "Pedro", "Suporte"));

        Iterator it = fila.criarIterator();

        while (it.temProximo()) {
            SenhaAtendimento proxima = (SenhaAtendimento) it.proximo();
            System.out.println("Chamando senha: " + proxima);
        }
    }
}