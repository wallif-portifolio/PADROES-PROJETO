public class LeiteExtraDecorator extends BebidaDecorator {
    public LeiteExtraDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Leite Extra";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 2.00;
    }
}