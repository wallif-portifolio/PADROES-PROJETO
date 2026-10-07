package Singleton;

public class PlayerMusica {

    public void aumentarVolume() {
        ControleVolume.getInstance().aumentar(10);
    }

    public void diminuirVolume() {
        ControleVolume.getInstance().diminuir(10);
    }

    public void mostrarVolume() {
        int volumeAtual = ControleVolume.getInstance().getVolume();
        System.out.println("Player: Volume atual = " + volumeAtual);
    }
}