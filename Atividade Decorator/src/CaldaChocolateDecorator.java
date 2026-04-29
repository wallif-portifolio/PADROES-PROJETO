public class CaldaChocolateDecorator extends BebidaDecorator {
    public CaldaChocolateDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + " + Calda de Chocolate";
    }

    @Override
    public double getPreco() {
        return bebidaDecorada.getPreco() + 2.50;
    }
}