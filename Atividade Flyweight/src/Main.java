public class Main {
    public static void main(String[] args) {
        TipoBloco pedra1 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        pedra1.exibir(10, 64, 20);
        TipoBloco pedra2 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        pedra2.exibir(11, 64, 20);
        TipoBloco pedra3 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        pedra3.exibir(12, 64, 20);
        System.out.println();

        TipoBloco grama1 = BlocoFactory.getBloco("Grama", "grama.png", true);
        grama1.exibir(15, 64, 22);
        TipoBloco grama2 = BlocoFactory.getBloco("Grama", "grama.png", true);
        grama2.exibir(16, 64, 22);
        System.out.println();

        TipoBloco madeira1 = BlocoFactory.getBloco("Madeira", "madeira.png", true);
        madeira1.exibir(30, 65, 10);
        System.out.println();

        System.out.println("pedra1 e pedra2 são o mesmo objeto? " + (pedra1 == pedra2));
    }
}