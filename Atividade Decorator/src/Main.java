public class Main {
    public static void main(String[] args) {
        System.out.println("--- Cafeteria com Decorator ---\n");

        // Café com leite extra
        Bebida cafeComLeite = new LeiteExtraDecorator(new Cafe());
        System.out.println("Bebida: " + cafeComLeite.getDescricao());
        System.out.printf("Preço: R$ %.2f\n\n", cafeComLeite.getPreco());

        // Capuccino com chantilly e canela
        Bebida capuccinoEspecial = new Capuccino();
        capuccinoEspecial = new ChantillyDecorator(capuccinoEspecial);
        capuccinoEspecial = new CanelaDecorator(capuccinoEspecial);

        System.out.println("Bebida: " + capuccinoEspecial.getDescricao());
        System.out.printf("Preço: R$ %.2f\n\n", capuccinoEspecial.getPreco());

        // Chocolate quente com leite extra, chantilly e calda de chocolate
        Bebida chocolateCompleto = new ChocolateQuente();
        chocolateCompleto = new LeiteExtraDecorator(chocolateCompleto);
        chocolateCompleto = new ChantillyDecorator(chocolateCompleto);
        chocolateCompleto = new CaldaChocolateDecorator(chocolateCompleto);

        System.out.println("Bebida: " + chocolateCompleto.getDescricao());
        System.out.printf("Preço: R$ %.2f\n", chocolateCompleto.getPreco());
    }
}