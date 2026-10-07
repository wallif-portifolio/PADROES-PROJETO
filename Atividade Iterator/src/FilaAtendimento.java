import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {
    private List<SenhaAtendimento> senhas = new ArrayList<>();

    public void adicionarSenha(SenhaAtendimento senha) {
        senhas.add(senha);
    }

    public Iterator criarIterator() {
        return new FilaIterator();
    }

    private class FilaIterator implements Iterator {
        private int posicao = 0;

        @Override
        public boolean temProximo() {
            return posicao < senhas.size();
        }

        @Override
        public Object proximo() {
            if (this.temProximo()) {
                return senhas.get(posicao++);
            }
            return null;
        }
    }
}