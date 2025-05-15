public abstract class Metodopago {
    protected double monto;

    public Metodopago(double monto) {
        this.monto = monto;
    }

    // Método abstracto a implementar por cada tipo de pago
    public abstract void procesarPago();

    // Método común para todos los tipos de pago
    public void mostrarResumen() {
        System.out.println("📄 Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
