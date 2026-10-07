public class Reserva {
    private String destino;
    private String codigo;

    public Reserva(String destino, String codigo) {
        this.destino = destino;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }
}