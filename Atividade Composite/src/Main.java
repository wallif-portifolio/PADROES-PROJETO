public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse", 80.0);
        Produto teclado = new Produto("Teclado", 150.0);
        Produto monitor = new Produto("Monitor", 900.0);
        Produto mousepad = new Produto("Mousepad", 40.0);

        Kit kitPerifericos = new Kit("Kit Periféricos");
        kitPerifericos.adicionar(mouse);
        kitPerifericos.adicionar(teclado);
        kitPerifericos.adicionar(mousepad);

        Kit kitSetup = new Kit("Kit Setup");
        kitSetup.adicionar(monitor);
        kitSetup.adicionar(kitPerifericos);

        kitSetup.exibir("");
    }
}