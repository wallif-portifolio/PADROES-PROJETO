package programa;

import programa.fabricas.Fabrica;
import programa.fabricas.nacional.FabricaNacional;
import programa.fabricas.internacional.FabricaInternacional;
import programa.servico.Checkout;

public class Main {
    public static void main(String[] args) {
        String pedidoId = "PED-10";

        // Teste com Fábrica Nacional (peso = 2.0 kg)
        System.out.println("=== TESTE COM FabricaNacional ===");
        Fabrica fabricaNacional = new FabricaNacional();
        Checkout checkoutNacional = new Checkout(fabricaNacional);
        checkoutNacional.finalizar(pedidoId, 99.0, 2.0, "12345-678");  // ← 99.0

        // Teste com Fábrica Internacional (peso = 3.0 kg)
        System.out.println("=== TESTE COM FabricaInternacional ===");
        Fabrica fabricaInternacional = new FabricaInternacional();
        Checkout checkoutInternacional = new Checkout(fabricaInternacional);
        checkoutInternacional.finalizar(pedidoId, 99.0, 3.0, "12345-678");  // ← 99.0
    }
}