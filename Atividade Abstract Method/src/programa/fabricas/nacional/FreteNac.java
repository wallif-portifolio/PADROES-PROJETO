package programa.fabricas.nacional;

import programa.interfaces.Frete;

public class FreteNac implements Frete {
    @Override
    public double calcular(double pesoKg, String cepDestino) {
        return 15.0 + (pesoKg * 2.0);
    }
}