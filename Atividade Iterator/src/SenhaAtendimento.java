public class SenhaAtendimento {
    private String codigo;
    private String nome;
    private String tipo;

    public SenhaAtendimento(String codigo, String nome, String tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome + " - " + tipo;
    }
}