package Singleton;

public class BotaoFisicoVolume {

    public void pressionarMais() {
        ControleVolume.getInstance().aumentar(5);
    }

    public void pressionarMenos() {
        ControleVolume.getInstance().diminuir(5);
    }
}