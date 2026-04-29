public class CanelaDecorator extends BebidaDecorator {
    public CanelaDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Canela";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 1.50;
    }
}