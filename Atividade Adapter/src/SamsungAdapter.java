public class SamsungAdapter implements ControleUniversal {
    private TvSamsungApi tv;

    public SamsungAdapter(TvSamsungApi tv) {
        this.tv = tv;
    }

    @Override
    public void ligar() {
        tv.powerOn();
    }

    @Override
    public void desligar() {
        tv.powerOff();
    }

    @Override
    public void aumentarVolume() {
        tv.volumeUp();
    }

    @Override
    public void diminuirVolume() {
        tv.volumeDown();
    }
}