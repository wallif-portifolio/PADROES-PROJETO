package Singleton;

public class ControleVolume {

    private static final ControleVolume INSTANCE = new ControleVolume();
    private int volume;

    private ControleVolume() {
        this.volume = 50;
    }

    public static ControleVolume getInstance() {
        return INSTANCE;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentar(int passo) {
        if (passo <= 0) {
            throw new IllegalArgumentException("Passo deve ser > 0");
        }
        volume = Math.min(volume + passo, 100);
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuir(int passo) {
        if (passo <= 0) {
            throw new IllegalArgumentException("Passo deve ser > 0");
        }
        volume = Math.max(volume - passo, 0);
        System.out.println("Volume diminuído para: " + volume);
    }

    public void mutar() {
        volume = 0;
        System.out.println("Volume mutado para: 0");
    }

    public void setVolume(int novoVolume) {
        if (novoVolume < 0) {
            throw new IllegalArgumentException("Volume não pode ser negativo");
        }
        volume = Math.min(novoVolume, 100);
        System.out.println("Volume ajustado para: " + volume);
    }
}