public class Main {
    public static void main(String[] args) {
        ViagemFacade facade = new ViagemFacade();

        Cliente cliente1 = new Cliente("João", "joao@email.com");
        System.out.println("--- Reserva 1 ---");
        facade.reservarViagem(cliente1, "Recife");

        System.out.println();

        Cliente cliente2 = new Cliente("Maria", "maria@email.com");
        System.out.println("--- Reserva 2 ---");
        facade.reservarViagem(cliente2, "Salvador");
    }
}