public class Factura {
    private String folioFactura;
    private String nombrecliente;
    private double total;

    // Constructor con parámetros
    public Factura(String folio, String cliente, double total) {
        this.folioFactura = folio;
        this.nombrecliente = cliente;
        this.total = total;
    }

    // toString() para mostrar la factura en el formato requerido
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folioFactura + ", cliente=" + nombrecliente + ", total=$" + total + "]";
    }

    // equals() para comparar facturas por su folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                      // Si es el mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false; // Si no es del mismo tipo
        Factura other = (Factura) obj;                     // Cast seguro
        return folioFactura.equals(other.folioFactura);                  // Comparación por folio
    }

    // hashCode() basado en el folio
    @Override
    public int hashCode() {
        return folioFactura.hashCode();                           // Usa el hash del String folio
    }
}
