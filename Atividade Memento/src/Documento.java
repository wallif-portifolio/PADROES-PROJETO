public class Documento {

    private String conteudo;

    public Documento(String conteudo) {
        this.conteudo = conteudo;
    }

    public MementoDocumento salvar() {
        return new MementoDocumento(conteudo);
    }

    public void restaurar(MementoDocumento memento) {
        this.conteudo = memento.getEstado();
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void exibir() {
        System.out.println("Conteúdo: " + conteudo);
    }
}