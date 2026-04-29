public class Main {
    public static void main(String[] args) {
        TvSamsungApi tvSamsung = new TvSamsungApi();
        TvLgApi tvLg = new TvLgApi();

        ControleUniversal controleSamsung = new SamsungAdapter(tvSamsung);
        ControleUniversal controleLg = new LgAdapter(tvLg);

        System.out.println("=== Controlando TV Samsung ===");
        controleSamsung.ligar();
        controleSamsung.aumentarVolume();
        controleSamsung.diminuirVolume();
        controleSamsung.desligar();

        System.out.println("\n=== Controlando TV LG ===");
        controleLg.ligar();
        controleLg.aumentarVolume();
        controleLg.diminuirVolume();
        controleLg.desligar();
    }
}