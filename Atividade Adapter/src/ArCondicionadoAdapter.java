public class ArCondicionadoAdapter implements ControleUniversal {
    private ArCondicionadoApi arCondicionado;

    public ArCondicionadoAdapter(ArCondicionadoApi arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void ligar() {
        arCondicionado.powerOn();
    }

    @Override
    public void desligar() {
        arCondicionado.powerOff();
    }

    @Override
    public void aumentarVolume() {
        // Para o ar-condicionado, aumentar volume = aumentar temperatura
        arCondicionado.aumentarTemperatura();
    }

    @Override
    public void diminuirVolume() {
        // Para o ar-condicionado, diminuir volume = diminuir temperatura
        arCondicionado.diminuirTemperatura();
    }
}