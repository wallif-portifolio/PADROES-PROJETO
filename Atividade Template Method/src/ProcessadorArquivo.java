public abstract class ProcessadorArquivo {

    public final void processar() {
        abrirArquivo();
        validarFormato();
        processarDados();
        finalizarProcessamento();
    }

    private void abrirArquivo() {
        System.out.println("Abrindo arquivo");
    }

    private void finalizarProcessamento() {
        System.out.println("Arquivo processado e movido.\n");
    }

    protected abstract void validarFormato();
    protected abstract void processarDados();
}