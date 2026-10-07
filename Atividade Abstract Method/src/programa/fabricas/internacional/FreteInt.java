package programa.fabricas.internacional;

import programa.interfaces.Frete;

public class FreteInt implements Frete {
    @Override
    public double calcular(double pesoKg, String cepDestino) {
        return 40.0 + (pesoKg * 5.0);
    }
}