public class PagoTarjeta extends Metodopago implements autenticable {
    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        return monto <= saldoDisponible;
    }

    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
