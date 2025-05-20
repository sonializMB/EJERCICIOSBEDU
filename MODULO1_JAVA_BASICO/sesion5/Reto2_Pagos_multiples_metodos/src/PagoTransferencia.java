public class PagoTransferencia extends Metodopago implements autenticable {
    private boolean conexionBanco;

    public PagoTransferencia(double monto, boolean conexionBanco) {
        super(monto);
        this.conexionBanco = conexionBanco;
    }

    @Override
    public boolean autenticar() {
        return conexionBanco; // Simula conexión válida o fallida
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia por $" + monto);
    }
}
