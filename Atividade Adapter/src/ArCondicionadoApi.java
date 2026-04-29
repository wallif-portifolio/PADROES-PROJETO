public class ArCondicionadoApi {
    private int temperatura = 22; // temperatura padrão

    public void powerOn() {
        System.out.println("Ar-Condicionado: Ligando... Temperatura: " + temperatura + "°C");
    }

    public void powerOff() {
        System.out.println("Ar-Condicionado: Desligando...");
    }

    public void aumentarTemperatura() {
        temperatura++;
        System.out.println("Ar-Condicionado: Temperatura aumentada para " + temperatura + "°C");
    }

    public void diminuirTemperatura() {
        temperatura--;
        System.out.println("Ar-Condicionado: Temperatura diminuída para " + temperatura + "°C");
    }

    public int getTemperatura() {
        return temperatura;
    }
}