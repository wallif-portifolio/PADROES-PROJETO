public class MiRemoteApp {
    public void controlarDispositivo(ControleUniversal dispositivo, String nomeDispositivo) {
        System.out.println("\n=== Controlando " + nomeDispositivo + " ===");

        System.out.println("\n1. Ligando dispositivo:");
        dispositivo.ligar();

        System.out.println("\n2. Aumentando volume:");
        dispositivo.aumentarVolume();
        dispositivo.aumentarVolume();

        System.out.println("\n3. Diminuindo volume:");
        dispositivo.diminuirVolume();

        System.out.println("\n4. Desligando dispositivo:");
        dispositivo.desligar();
    }
}