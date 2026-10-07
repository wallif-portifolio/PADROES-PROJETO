import Singleton.Alarme;
import Singleton.BotaoFisicoVolume;
import Singleton.ControleVolume;
import Singleton.PlayerMusica;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== TESTE 1: MESMA INSTÂNCIA =====");
        ControleVolume a = ControleVolume.getInstance();
        ControleVolume b = ControleVolume.getInstance();
        System.out.println("Mesma instância? " + (a == b));
        System.out.println();

        System.out.println("===== TESTE 2: BOTÃO FÍSICO =====");
        BotaoFisicoVolume botao = new BotaoFisicoVolume();
        PlayerMusica player = new PlayerMusica();
        Alarme alarme = new Alarme();

        player.mostrarVolume(); // 50
        botao.pressionarMais();
        botao.pressionarMais();
        player.mostrarVolume(); // 60
        System.out.println();

        System.out.println("===== TESTE 3: ALARME FORÇA VOLUME =====");
        alarme.tocar();
        player.mostrarVolume(); // 80
        System.out.println();

        System.out.println("===== TESTE 4: MUTE E LIMITES =====");
        ControleVolume.getInstance().mutar();
        player.mostrarVolume(); // 0

        ControleVolume.getInstance().setVolume(95);
        botao.pressionarMais(); // 95 + 5 = 100
        botao.pressionarMais(); // trava em 100
        player.mostrarVolume(); // 100

        System.out.println("\n===== TESTE EXTRA: VALIDAÇÕES =====");
        try {
            ControleVolume.getInstance().aumentar(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            ControleVolume.getInstance().setVolume(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}