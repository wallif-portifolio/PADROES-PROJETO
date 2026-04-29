public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }
}