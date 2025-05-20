public class CajaRegistradora {
    public static void main(String[] args) {
        Metodopago[] pagos = new Metodopago[] {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(200.0, false) // simulamos fallo
        };

        for (Metodopago pago : pagos) {
            if (pago instanceof autenticable) {
                autenticable auth = (autenticable) pago;
                if (auth.autenticar()) {
                    System.out.println("✅ Autenticación exitosa.");
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
                }
                System.out.println();
            }
        }
    }
}
