import java.util.HashMap;
import java.util.Map;

public class BlocoFactory {
    private static Map<String, TipoBloco> blocosCache = new HashMap<>();

    public static TipoBloco getBloco(String nome, String textura, boolean solido) {
        String chave = nome + "-" + textura + "-" + solido;

        if (!blocosCache.containsKey(chave)) {
            TipoBloco novoBloco = new TipoBloco(nome, textura, solido);
            blocosCache.put(chave, novoBloco);
            System.out.println("Criando novo tipo de bloco: " + nome); // Apenas para demonstração
        }

        return blocosCache.get(chave);
    }

    public static int getQuantidadeTiposCache() {
        return blocosCache.size();
    }
}